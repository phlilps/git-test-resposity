package com.baijie.controller;

import com.baijie.entity.Role;
import com.baijie.service.RoleService;
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

@RequestMapping("/Role")
@Controller
public class RoleController {
    @Autowired
    private RoleService roleService;
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
        List<Role> message = null;
        message = roleService.findAll(userName);
        PageInfo<Role> pageInfo = new PageInfo<>(message);
        model.addAttribute("userList",message);
//        System.out.println("首页：" + pageInfo.getFirstPage());
//        System.out.println("上一页：" + pageInfo.getPrePage());
//        System.out.println("下一页：" + pageInfo.getNextPage());
//        System.out.println("尾页：" + pageInfo.getLastPage());
//        System.out.println("总页数：" + pageInfo.getPages());
//        model.addAttribute("pageInfo", pageInfo);
        List arr = new ArrayList();
        arr.add(message);
        arr.add(pageInfo);
        return arr;
    }

    @RequestMapping("/del")
    @ResponseBody
    public int delByid(Integer  modUleId) {
        if (modUleId != null) {
            roleService.delByid(modUleId);
            return 1;
        } else {
            return 0;
        }
    }
    @RequestMapping("/return")
    public String update(Integer id, HttpSession session) {
        System.out.println(id+" return");
        session.setAttribute("id", id);
        Role BytId = roleService.findBytId(id);
        session.setAttribute("Bytid",BytId);
        return "userrole-add";
    }

    @RequestMapping("/addAndUpdata")
    public String addAndUpdata(Role role, HttpSession session) {
        System.out.println(session.getAttribute("id")+" addAndUpdata");


        if (session.getAttribute("id")==null) {
            roleService.adduser(role);
        } else {
            role.setId((Integer) session.getAttribute("id"));
            roleService.update(role);
        }
        return "userrole-list";
    }

}
