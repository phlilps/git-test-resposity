package com.baijie.controller;

import com.baijie.entity.Site;
import com.baijie.service.SiteService;
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

@RequestMapping("/Site")
@Controller
public class SiteController {
    @Autowired
    private SiteService siteService;
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
        List<Site> message = null;
        message = siteService.findAll(userName);
        PageInfo<Site> pageInfo = new PageInfo<>(message);
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
            siteService.delByid(modUleId);
            return 1;
        } else {
            return 0;
        }
    }
    @RequestMapping("/return")
    public String update(Integer id, HttpSession session) {
        System.out.println(id+" return");
        session.setAttribute("id", id);
        Site BytId = siteService.findBytId(id);
        session.setAttribute("Bytid",BytId);
        return "site-add";
    }

    @RequestMapping("/addAndUpdata")
    public String addAndUpdata(Site site, HttpSession session) {
        System.out.println(session.getAttribute("id")+" addAndUpdata");


        if (session.getAttribute("id")==null) {
            siteService.adduser(site);
        } else {
            site.setId((Integer) session.getAttribute("id"));
            siteService.update(site);
        }
        return "site-list";
    }
}
