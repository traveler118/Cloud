package com.ljl.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author ljl
 * @version 1.0
 * @date 2020-06-09 15:55
 */
@Component
public class PaymenFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id){
        return "-----------paymentInfo_OK";
    }
    @Override
    public String paymentInfo_TimeOut(Integer id){
        return "-----------paymentInfo_TimeOut";
    }
}
