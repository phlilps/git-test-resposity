package com.baijie.service.impl;

import com.baijie.dao.SiteDao;
import com.baijie.entity.Site;
import com.baijie.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SiteServiceImpl implements SiteService{
    @Autowired
    private SiteDao siteDao;
    @Override
    public List<Site> findAll(String Name) {
        return siteDao.findAll(Name);
    }

    @Override
    public void delByid(Integer id) {
        siteDao.delByid(id);
    }

    @Override
    public void adduser(Site site) {
        siteDao.adduser(site);
    }

    @Override
    public void update(Site site) {
        siteDao.update(site);
    }

    @Override
    public Site findBytId(Integer id) {
        return siteDao.findBytId(id);
    }
}
