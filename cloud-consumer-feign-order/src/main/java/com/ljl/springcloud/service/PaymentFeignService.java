package com.ljl.springcloud.service;

import com.ljl.springcloud.entities.CommonResult;
import com.ljl.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ljl
 * @version 1.0
 * @date 2020-06-05 18:51
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentId(@PathVariable("id") Long id);
    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
