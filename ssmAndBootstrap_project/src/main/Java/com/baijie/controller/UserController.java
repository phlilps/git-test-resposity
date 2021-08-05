package com.baijie.controller;

import com.alibaba.fastjson.JSONObject;
import com.baijie.entity.User;
import com.baijie.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    /**
     * 登录功能
     */
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public JSONObject loginMethod(User user,String input, HttpSession session) {
        User user1 = new User();
        user1.setUsername(user.getUsername());
        user1.setPassword(user.getPassword());
        session.setAttribute("user", user1);
        List<User> login = userService.login(user1);
        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(login.get(0));
        if (Boolean.parseBoolean(input)==true){
            session.setAttribute("user2", user1);
//            System.out.println(input);
        }
        return jsonObject;
    }

    @RequestMapping("/logOut")
    public  String  logOut(HttpSession session){
        session.invalidate();
        return "redirect:../login.jsp";
    }
    @RequestMapping("/findAll")
    @ResponseBody
    public List list(String userName, Model model, Integer pageIndex, Integer pageSize) {
        if (pageIndex == null) {
            pageIndex = 1;
        }
        if (pageSize == null) {
            pageSize = 5;
        }
        Page<Object> page = PageHelper.startPage(pageIndex, pageSize);
        List<User> s_users = null;
        s_users = userService.findAll(userName);
        PageInfo<User> pageInfo = new PageInfo<>(s_users);
        model.addAttribute("userList", s_users);
//        System.out.println("首页：" + pageInfo.getFirstPage());
//        System.out.println("上一页：" + pageInfo.getPrePage());
//        System.out.println("下一页：" + pageInfo.getNextPage());
//        System.out.println("尾页：" + pageInfo.getLastPage());
//        System.out.println("总页数：" + pageInfo.getPages());
//        model.addAttribute("pageInfo", pageInfo);
        List arr = new ArrayList();
        arr.add(s_users);
        arr.add(pageInfo);
        return arr;
    }

    @RequestMapping("/del")
    @ResponseBody
    public int delByid(Integer userld) {
        if (userld != null) {
//            System.out.println(userld);
            userService.delByid(userld);
            return 1;
        } else {
            return 0;
        }
    }
    @RequestMapping("/return")
    public String update(Integer id, HttpSession session) {
//        User getId = userService.findBytId(id);
        System.out.println(id+" return");
        session.setAttribute("id", id);
        User BytId = userService.findBytId(id);
        session.setAttribute("Bytid",BytId);
        return "user-add";
    }

    @RequestMapping("/addAndUpdata")
    public String addAndUpdata(User user, HttpSession session) {
            Object id= session.getAttribute("id");
        System.out.println(id+" addAndUpdata");
//        System.out.println(user);

//        System.out.println(user.getId());
        if (id==null) {
            userService.adduser(user);
        } else {
            user.setId((Integer) id);
            userService.update(user);
        }
        return "user-list";
    }
}
