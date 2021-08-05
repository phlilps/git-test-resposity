package com.baijie.service;

import com.baijie.entity.Site;

import java.util.List;

public interface SiteService {
    public List<Site> findAll(String Name);
    public void delByid(Integer id);
    public  void  adduser(Site site);
    public  void  update(Site site);
    public Site findBytId(Integer id);
}
