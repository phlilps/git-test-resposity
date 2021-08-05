package com.baijie.dao;

import com.baijie.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    public List<User> login(User user);
    public List<User> findAll(@Param("userName")String userName);
    public void delByid(@Param("id")Integer id);
    public  void  adduser(User user);
    public  void  update(User user);
    public User findBytId(@Param("id")Integer id);
}
