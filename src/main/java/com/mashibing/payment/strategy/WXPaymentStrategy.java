package com.mashibing.payment.strategy;

import java.math.BigDecimal;

public class WXPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(BigDecimal amount) {
        System.out.println("【微信支付】正在支付金额:￥" + amount);
    }
}
