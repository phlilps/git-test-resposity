package com.baijie.service.impl;

import com.baijie.dao.OrderDao;
import com.baijie.entity.Order;
import com.baijie.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderDao orderDao;
    @Override
    public List<Order> findAll(String Name) {
        return orderDao.findAll(Name);
    }

    @Override
    public void delByid(Integer id) {
    orderDao.delByid(id);
    }

    @Override
    public void adduser(Order order) {
    orderDao.adduser(order);
    }

    @Override
    public void update(Order order) {
    orderDao.update(order);
    }

    @Override
    public Order findBytId(Integer id) {
        return orderDao.findBytId(id);
    }
}
