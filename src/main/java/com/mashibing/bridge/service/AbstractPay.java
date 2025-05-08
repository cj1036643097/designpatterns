package com.mashibing.bridge.service;

import java.math.BigDecimal;

public abstract class AbstractPay {
    //桥接对象
    protected IPayMode payMode;

    public AbstractPay(IPayMode payMode) {
        this.payMode = payMode;
    }

    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
