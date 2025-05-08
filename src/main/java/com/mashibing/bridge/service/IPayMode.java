package com.mashibing.bridge.service;

public interface IPayMode {
    // 安全校验：对各种支付方式进行校验
    boolean security(String uId);



}
