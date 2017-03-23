package com.dbsy.controller;

import com.dbsy.pojo.User;
import com.dbsy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ldb on 2017/3/22.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    @ResponseBody
    public User showUser(){
        return  userService.getUser();
    }
}
