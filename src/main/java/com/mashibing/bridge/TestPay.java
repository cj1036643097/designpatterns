package com.mashibing.bridge;

import com.mashibing.bridge.service.AbstractPay;
import com.mashibing.bridge.service.impl.PayFaceMode;
import com.mashibing.bridge.service.impl.WxPay;

import java.math.BigDecimal;

public class TestPay {
    public static void main(String[] args){
        System.out.println("测试微信支付,人脸方式");
        AbstractPay wxPay = new WxPay(new PayFaceMode());
        wxPay.transfer("wx_00000001","20250508001", BigDecimal.valueOf(500));
    }
}
