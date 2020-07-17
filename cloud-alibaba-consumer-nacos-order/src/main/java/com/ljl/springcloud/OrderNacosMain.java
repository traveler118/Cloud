package com.ljl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ljl
 * @version 1.0
 * @date 2020-06-23 18:24
 */

@EnableDiscoveryClient
@SpringBootApplication
public class OrderNacosMain {
    public static void main(String[] args)
    {
        SpringApplication.run(OrderNacosMain.class,args);
    }
}
