package com.ray.server.impl;

import com.ray.server.ISayHelloWorldServer;

/**
 * 说Hello World SPI 接口英文实现
 * @author Ray
 * @createTime 2018-03-19 11:04
 */
public class SayHelloWorldServerImplByEn implements ISayHelloWorldServer {

    @Override
    public void say() {
        System.out.println("Hello World");
    }
}
