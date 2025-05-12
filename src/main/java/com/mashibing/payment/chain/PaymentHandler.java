package com.mashibing.payment.chain;

import com.mashibing.payment.dto.PaymentRequest;

public abstract class PaymentHandler {

    protected PaymentHandler next;

    public PaymentHandler setNext(PaymentHandler next){
        this.next = next;
        return next;
    }

    public abstract void handle(PaymentRequest request);
}
