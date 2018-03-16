package com.ray;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * 用户组件启动类
 * @author Ray
 * @createTime 2018-03-17 0:28
 */
@SpringBootApplication
@ComponentScan("com.ray")
@ImportResource("classpath:dubbo-server.xml")
public class UserStartApplicatin {
    public static void main(String[] args){
        SpringApplication.run(UserStartApplicatin.class,args);
    }
}
