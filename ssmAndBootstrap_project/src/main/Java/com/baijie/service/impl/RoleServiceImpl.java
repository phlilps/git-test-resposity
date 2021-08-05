package com.baijie.service.impl;

import com.baijie.dao.RoleDao;
import com.baijie.entity.Role;
import com.baijie.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;
    @Override
    public List<Role> findAll(String userName) {
        return roleDao.findAll(userName);
    }

    @Override
    public void delByid(Integer id) {
        roleDao.delByid(id);
    }

    @Override
    public void adduser(Role role) {
        roleDao.adduser(role);
    }

    @Override
    public void update(Role role) {
        roleDao.update(role);
    }

    @Override
    public Role findBytId(Integer id) {
        return roleDao.findBytId(id);
    }
}
