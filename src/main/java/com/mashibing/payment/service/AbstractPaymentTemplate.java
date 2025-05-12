package com.mashibing.payment.service;

import com.mashibing.payment.strategy.PaymentStrategy;

import java.math.BigDecimal;

public abstract class AbstractPaymentTemplate {
    public final void processPayment(BigDecimal amount,String payWay){
        beforePayment(amount);
        PaymentStrategy paymentStrategy = createPaymentStrategy(payWay);
        paymentStrategy.pay(amount);
        afterPayment(amount);
    }
    protected void beforePayment(BigDecimal amount){
        System.out.println("准备支付，金额为：￥" + amount);
    }
    protected void afterPayment(BigDecimal amount){
        System.out.println("支付完成，金额为：￥" + amount);
    }
    protected abstract PaymentStrategy createPaymentStrategy(String payWay);
}
