package com.mashibing.bridge;

import com.mashibing.bridge.service.AbstractPay;
import com.mashibing.bridge.service.impl.PayFaceMode;
import com.mashibing.bridge.service.impl.WxPay;
import com.mashibing.function.Converter;

import java.math.BigDecimal;

public class TestPay {
    public static void main(String[] args){
        int num = 1;
        Converter<Integer,String> stringConverter = (from) -> String.valueOf(from + 1);
        System.out.println(stringConverter.convert(2));//3
        System.out.println("测试微信支付,人脸方式");
        AbstractPay wxPay = new WxPay(new PayFaceMode());
        wxPay.transfer("wx_00000001","20250508001", BigDecimal.valueOf(500));
    }
}
