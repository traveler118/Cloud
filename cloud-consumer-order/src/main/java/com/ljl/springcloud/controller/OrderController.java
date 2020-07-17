package com.ljl.springcloud.controller;

import com.ljl.lb.LoadBalancer;
import com.ljl.springcloud.entities.CommonResult;
import com.ljl.springcloud.entities.Payment;
import com.sun.jndi.toolkit.url.Uri;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

/**
 * @author ljl
 * @version 1.0
 * @date 2020-06-01 18:47
 */
@RestController
@Slf4j
public class OrderController {
    //调用单机版
    //public static final String PAYMENT_URL = "http://localhost:8001";
    //CLOUD-PAYMENT-SERVICE注册服务中心名称，用于随机调用集群的支付功能对应cloud-provider-payment,cloud-provider-payment02
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";
    @Resource
    private RestTemplate restTemplate;
    @Resource
    private LoadBalancer loadBalancer;
    @Resource
    private DiscoveryClient client;

    @GetMapping(value = "/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return  restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment, CommonResult.class);
    }
    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentId(@PathVariable("id")Long id){
        return  restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }
    @GetMapping(value = "/consumer/payment/getForEntity/{id}")
    public CommonResult<Payment> getForEntityPaymentId(@PathVariable("id")Long id){
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
        if(entity.getStatusCode().is2xxSuccessful()){
            return entity.getBody();
        }else{
            return new CommonResult<>(444,"操作失败");
        }
    }
    //手写Ribbon读取注册集群支付服务轮询算法
    @GetMapping(value = "/consumer/payment/lb")
    public String getPaymentLB(){
        List<ServiceInstance> instances = client.getInstances("CLOUD-PAYMENT-SERVICE");
        if(instances == null || instances.size() <=0 ){
            return null;
        }
        ServiceInstance serviceInstance = loadBalancer.instances(instances);
        URI uri = serviceInstance.getUri();
        return restTemplate.getForObject(uri+"/payment/lb",String.class);
    }

    @GetMapping("/consumer/payment/zipkin")
    public String paymentZipkin()
    {
        String result = restTemplate.getForObject("http://localhost:8001"+"/payment/zipkin/", String.class);
        return result;
    }

}
