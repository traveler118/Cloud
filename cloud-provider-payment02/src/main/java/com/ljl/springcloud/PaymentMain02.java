package com.ljl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ljl
 * @version 1.0
 * @date 2020-05-30 18:43
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain02 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain02.class,args);
    }
}
