package com.ljl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author ljl
 * @version 1.0
 * @date 2020-06-17 18:28
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain.class,args);
    }
}
