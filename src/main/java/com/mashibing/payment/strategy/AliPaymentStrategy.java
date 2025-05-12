package com.mashibing.payment.strategy;

import java.math.BigDecimal;

public class AliPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(BigDecimal amount) {
        System.out.println("【支付宝支付】正在支付金额:￥" + amount);
    }
}
