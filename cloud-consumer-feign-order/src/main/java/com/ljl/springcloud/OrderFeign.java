package com.ljl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ljl
 * @version 1.0
 * @date 2020-06-05 18:49
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeign {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeign.class,args);
    }
}
