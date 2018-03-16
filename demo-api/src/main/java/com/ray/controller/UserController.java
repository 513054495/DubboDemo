package com.ray.controller;

import com.ray.domain.User;
import com.ray.server.IUserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制类
 * @author Ray
 * @createTime 2018-03-17 0:45
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserServer userServer;

    @RequestMapping(value = "/getById",method = RequestMethod.GET)
    public User getById(@RequestParam("id")long id){
        return userServer.getById(id);
    }
}
