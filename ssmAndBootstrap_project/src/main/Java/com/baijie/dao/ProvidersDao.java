package com.baijie.dao;

import com.baijie.entity.Providers;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProvidersDao {
    public List<Providers> findAll(@Param("Name")String Name);
    public void delByid(@Param("id")Integer id);
    public  void  adduser(Providers providers);
    public  void  update(Providers providers);
    public Providers findBytId(@Param("id")Integer id);
}
