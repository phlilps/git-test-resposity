package com.baijie.dao;

import com.baijie.entity.Site;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SiteDao {
    public List<Site> findAll(@Param("Name")String Name);
    public void delByid(@Param("id")Integer id);
    public  void  adduser(Site site);
    public  void  update(Site site);
    public Site findBytId(@Param("id")Integer id);
}
