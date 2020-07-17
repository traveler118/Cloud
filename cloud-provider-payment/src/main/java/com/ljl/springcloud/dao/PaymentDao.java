package com.ljl.springcloud.dao;

import com.ljl.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author ljl
 * @version 1.0
 * @date 2020-05-31 16:39
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentId(@Param("id")Long id);
}
