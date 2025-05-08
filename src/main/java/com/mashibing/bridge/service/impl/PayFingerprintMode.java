package com.mashibing.bridge.service.impl;

import com.mashibing.bridge.service.IPayMode;

public class PayFingerprintMode implements IPayMode {

    @Override
    public boolean security(String uId) {
        System.out.println("指纹支付验证通过");
        return true;
    }
}
