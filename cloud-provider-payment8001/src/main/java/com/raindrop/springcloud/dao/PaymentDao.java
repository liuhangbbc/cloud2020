package com.raindrop.springcloud.dao;

import com.raindrop.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Classname PaymengDao
 * @Description 支付Dao
 * @Created by liuhang
 * @Date 2020/3/27 20:44
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
