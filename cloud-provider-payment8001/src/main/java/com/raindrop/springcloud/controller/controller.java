package com.raindrop.springcloud.controller;

import com.raindrop.springcloud.entities.CommonResult;
import com.raindrop.springcloud.entities.Payment;
import com.raindrop.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Classname controller
 * @Description TODO
 * @Created by liuhang
 * @Date 2020/3/27 21:35
 */
@RestController
@Slf4j
public class controller {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult<Payment> create(Payment payment) {
        int result = paymentService.create(payment);
        log.info("==== 插入结果: " + result);
        if (result > 0)
            return new CommonResult(200, "插入数据成功", result);
        else
            return new CommonResult(444, "插入数据库失败", null);
    }

    @GetMapping(value = "payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("***** 插入结果: " + payment);
        if (payment != null)
            return new CommonResult(200, "查询成功", payment);
        else
            return new CommonResult(444, "没有对应记录，查询Id" + id, null);
    }
}
