package com.mashibing.factory.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseResult {

    private String status; // 状态码

    private String message; // 信息

    private Object data;   //数据

    public ResponseResult(String message, String status) {
        this.message = message;
        this.status = status;
    }
}
