package com.raindrop.springcloud.service.impl;

import com.raindrop.springcloud.dao.PaymentDao;
import com.raindrop.springcloud.entities.Payment;
import com.raindrop.springcloud.service.PaymentService;
import io.micrometer.shaded.org.pcollections.PSequence;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Classname PaymentServiceImpl
 * @Description 支付服务接口实现
 * @Created by liuhang
 * @Date 2020/3/27 21:29
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
