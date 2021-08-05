package com.baijie.service;

import com.baijie.entity.Providers;

import java.util.List;

public interface ProvidersService {
    public List<Providers> findAll(String Name);
    public void delByid(Integer id);
    public  void  adduser(Providers providers);
    public  void  update(Providers providers);
    public Providers findBytId(Integer id);
}
