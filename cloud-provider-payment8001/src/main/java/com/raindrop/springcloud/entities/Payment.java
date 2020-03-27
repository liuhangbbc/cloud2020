package com.raindrop.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Classname Payment
 * @Description 支付实体
 * @Created by liuhang
 * @Date 2020/3/27 20:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
