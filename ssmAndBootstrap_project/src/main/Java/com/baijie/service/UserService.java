package com.baijie.service;

import com.baijie.entity.User;

import java.util.List;

public interface UserService {
    public List<User> login(User user);
    public List<User> findAll(String userName);
    public void delByid(Integer id);
    public  void  adduser(User user);
    public  void  update(User user);
    public User findBytId(Integer id);
}
