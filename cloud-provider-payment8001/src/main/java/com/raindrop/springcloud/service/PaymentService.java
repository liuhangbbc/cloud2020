package com.raindrop.springcloud.service;

import com.raindrop.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @Classname PaymentService
 * @Description 支付服务接口
 * @Created by liuhang
 * @Date 2020/3/27 21:29
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
