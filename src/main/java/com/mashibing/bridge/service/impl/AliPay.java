package com.mashibing.bridge.service.impl;

import com.mashibing.bridge.service.AbstractPay;
import com.mashibing.bridge.service.IPayMode;

import java.math.BigDecimal;

public class AliPay extends AbstractPay {

    public AliPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        System.out.println("支付宝渠道支付开始");
        boolean security = payMode.security(uId);
        System.out.println("支付宝渠道支付风险校验：" + uId + "," + tradeId  + "," + security);
        if(!security){
            System.out.println("交易失败");
            return "500";
        }
        System.out.println("支付宝支付成功");
        return "200";
    }
}
