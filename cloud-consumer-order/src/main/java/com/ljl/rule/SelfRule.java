package com.ljl.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ljl
 * @version 1.0
 * @date 2020-06-03 20:36
 */
@Configuration
public class SelfRule {
    @Bean
    public IRule Rule(){
        return new RandomRule();//定义为随机
    }
}
