package com.mashibing.bridge.service.impl;

import com.mashibing.bridge.service.IPayMode;

public class PayPwdMode implements IPayMode {
    @Override
    public boolean security(String uId) {
        System.out.println("密码支付校验通过");
        return true;
    }
}
