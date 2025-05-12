package com.mashibing.payment.factory;

import com.mashibing.payment.strategy.AliPaymentStrategy;
import com.mashibing.payment.strategy.PaymentStrategy;
import com.mashibing.payment.strategy.WXPaymentStrategy;

public class PaymentFactory {
    public static PaymentStrategy getPaymentStrategy(String payWay) {
        if ("alipay".equals(payWay)) {
            return new AliPaymentStrategy();
        } else if ("wechat".equals(payWay)) {
            return new WXPaymentStrategy();
        }
        throw new IllegalArgumentException("不支持的支付方式");
    }

}
