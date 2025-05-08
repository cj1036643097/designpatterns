package com.mashibing.bridge.service.impl;

import com.mashibing.bridge.service.IPayMode;

public class PayFaceMode implements IPayMode {
    @Override
    public boolean security(String uId) {
        System.out.println("人脸支付验证成功");
        return true;
    }
}
