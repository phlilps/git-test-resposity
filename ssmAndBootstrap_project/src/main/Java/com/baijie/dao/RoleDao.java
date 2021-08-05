package com.baijie.dao;

import com.baijie.entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleDao {
    public List<Role> findAll(@Param("Name")String Name);
    public void delByid(@Param("id")Integer id);
    public  void  adduser(Role role);
    public  void  update(Role role);
    public Role findBytId(@Param("id")Integer id);
}
