package com.ljl.springcloud.controller;

import com.ljl.springcloud.entities.CommonResult;
import com.ljl.springcloud.entities.Payment;
import com.ljl.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author ljl
 * @version 1.0
 * @date 2020-06-05 18:56
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id")Long id){
        return paymentFeignService.getPaymentId(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        //openfeign-ribbon 默认是一秒钟,超过报错
        return paymentFeignService.paymentFeignTimeout();
    }
}
