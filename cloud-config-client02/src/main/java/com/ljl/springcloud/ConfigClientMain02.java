package com.ljl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ljl
 * @version 1.0
 * @date 2020-06-18 19:23
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain02 {
    public static void main(String[] args) {
        SpringApplication.run( ConfigClientMain02.class,args);
    }
}
