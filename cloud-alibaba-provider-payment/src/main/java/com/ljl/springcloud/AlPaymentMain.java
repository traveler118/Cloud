package com.ljl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ljl
 * @version 1.0
 * @date 2020-06-23 17:47
 */
@EnableDiscoveryClient
@SpringBootApplication
public class AlPaymentMain {
    public static void main(String[] args) {
        SpringApplication.run(AlPaymentMain.class,args);
    }
}
