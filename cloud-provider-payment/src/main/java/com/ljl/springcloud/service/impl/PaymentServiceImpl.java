package com.ljl.springcloud.service.impl;

import com.ljl.springcloud.dao.PaymentDao;
import com.ljl.springcloud.entities.Payment;
import com.ljl.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author ljl
 * @version 1.0
 * @date 2020-05-31 16:56
 */
@Service
public class PaymentServiceImpl implements PaymentService{
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentId(Long id){
        return paymentDao.getPaymentId(id);
    }
}
