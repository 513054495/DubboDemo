package com.ray.controller;

import com.ray.domain.User;
import com.ray.server.ISayHelloWorldServer;
import com.ray.server.IUserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.ServiceLoader;

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
        //加载SPI实现的接口列表
        ServiceLoader<ISayHelloWorldServer> sayHelloWorldServers= ServiceLoader.load(ISayHelloWorldServer.class);
        Iterator<ISayHelloWorldServer> iterator=sayHelloWorldServers.iterator();
        while(null!=iterator&&iterator.hasNext()){
            ISayHelloWorldServer iSayHelloWorldServer=iterator.next();
            if(iSayHelloWorldServer.getClass().getName().equals("com.ray.server.impl.SayHelloWorldServerImplByCn")) {
                iSayHelloWorldServer.say();
            }
        }
        return userServer.getById(id);
    }
}
