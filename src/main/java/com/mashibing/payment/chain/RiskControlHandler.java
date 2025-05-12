package com.mashibing.payment.chain;

import com.mashibing.payment.dto.PaymentRequest;

public class RiskControlHandler extends PaymentHandler{
    @Override
    public void handle(PaymentRequest request) {
        System.out.println("进行风控检查。。。");
        if(100_0000L > request.getAmount().doubleValue()){
            throw new RuntimeException("交易金额过大");
        }
        if(this.next != null){
            this.next.handle(request);
        }
    }
}
