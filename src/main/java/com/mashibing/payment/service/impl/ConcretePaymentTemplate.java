package com.mashibing.payment.service.impl;

import com.mashibing.payment.factory.PaymentFactory;
import com.mashibing.payment.service.AbstractPaymentTemplate;
import com.mashibing.payment.strategy.PaymentStrategy;

public class ConcretePaymentTemplate extends AbstractPaymentTemplate {

    @Override
    protected PaymentStrategy createPaymentStrategy(String payWay) {
        return PaymentFactory.getPaymentStrategy(payWay);
    }
}
