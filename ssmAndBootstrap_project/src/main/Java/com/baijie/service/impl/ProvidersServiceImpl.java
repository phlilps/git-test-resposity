package com.baijie.service.impl;

import com.baijie.dao.ProvidersDao;
import com.baijie.entity.Providers;
import com.baijie.service.ProvidersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvidersServiceImpl implements ProvidersService {
   @Autowired
    private ProvidersDao providersDao;

    @Override
    public List<Providers> findAll(String Name) {
        return providersDao.findAll(Name);
    }

    @Override
    public void delByid(Integer id) {
        providersDao.delByid(id);
    }

    @Override
    public void adduser(Providers providers) {
        providersDao.adduser(providers);
    }

    @Override
    public void update(Providers providers) {
        providersDao.update(providers);
    }

    @Override
    public Providers findBytId(Integer id) {
        return providersDao.findBytId(id);
    }
}
