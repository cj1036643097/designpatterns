package com.mashibing.bridge.service.impl;

import com.mashibing.bridge.service.AbstractPay;
import com.mashibing.bridge.service.IPayMode;

import java.math.BigDecimal;

/**
 * 微信支付
 */
public class WxPay extends AbstractPay {
    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        System.out.println("微信渠道支付开始");
        boolean security = payMode.security(uId);
        System.out.println("微信渠道支付风险校验：" + uId + "," + tradeId  + "," + security);
        if(!security){
            System.out.println("交易失败");
            return "500";
        }
        System.out.println("微信支付成功");
        return "200";
    }

    public WxPay(IPayMode payMode) {
        super(payMode);
    }
}
