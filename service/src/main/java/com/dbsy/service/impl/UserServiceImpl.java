package com.dbsy.service.impl;

import com.dbsy.dao.UserDao;
import com.dbsy.pojo.User;
import com.dbsy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ldb on 2017/3/22.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public User getUser() {
        return userDao.getUser();
    }
}
