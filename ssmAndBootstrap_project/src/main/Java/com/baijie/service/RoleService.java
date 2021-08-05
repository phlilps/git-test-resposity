package com.baijie.service;

import com.baijie.entity.Role;

import java.util.List;

public interface RoleService {
    public List<Role> findAll(String userName);
    public void delByid(Integer id);
    public  void  adduser(Role role);
    public  void  update(Role role);
    public Role findBytId(Integer id);
}
