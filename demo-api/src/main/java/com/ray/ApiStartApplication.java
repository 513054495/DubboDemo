package com.ray;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * API启动类
 * @author Ray
 * @createTime 2018-03-17 0:48
 */
@SpringBootApplication
@ImportResource("classpath:dubbo-consumer.xml")
public class ApiStartApplication {
    public static void main(String[] args){
        SpringApplication.run(ApiStartApplication.class,args);
    }
}
