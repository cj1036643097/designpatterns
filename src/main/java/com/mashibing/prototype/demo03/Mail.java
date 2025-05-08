package com.mashibing.prototype.demo03;

import lombok.Data;

@Data
public class Mail {
    private String receive; // 收件人
    private String subject; // 主题
    private String appellation; // 称呼
    private String context; // 内容
    private String tail; // 尾部

    public Mail(AdvTemplate advTemplate){
        this.context = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }


}
