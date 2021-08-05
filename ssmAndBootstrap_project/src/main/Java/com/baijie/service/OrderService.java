package com.baijie.service;

import com.baijie.entity.Order;

import java.util.List;

public interface OrderService {
    public List<Order> findAll(String Name);
    public void delByid(Integer id);
    public  void  adduser(Order order);
    public  void  update(Order order);
    public Order findBytId(Integer id);
}
