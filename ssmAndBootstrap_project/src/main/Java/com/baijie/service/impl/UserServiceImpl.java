package com.baijie.service.impl;

import com.baijie.dao.UserDao;
import com.baijie.entity.User;
import com.baijie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> login(User user) {
        return userDao.login(user) ;
    }

    @Override
    public List<User> findAll(String userName) {
        return userDao.findAll(userName);
    }

    @Override
    public void delByid(Integer id) {
        userDao.delByid(id);
    }

    @Override
    public void adduser(User user) {
        userDao.adduser(user);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public User findBytId(Integer id) {
        return userDao.findBytId(id);
    }

}
