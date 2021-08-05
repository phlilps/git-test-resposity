package com.baijie.dao;

import com.baijie.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDao {
    public List<Order> findAll(@Param("Name")String Name);
    public void delByid(@Param("id")Integer id);
    public  void  adduser(Order order);
    public  void  update(Order order);
    public Order findBytId(@Param("id")Integer id);
}
