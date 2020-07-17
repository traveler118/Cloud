package com.ljl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ljl
 * @version 1.0
 * @date 2020-06-02 18:16
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain02 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain02.class,args);
    }
}
