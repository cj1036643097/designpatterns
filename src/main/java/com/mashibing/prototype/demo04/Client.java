package com.mashibing.prototype.demo04;

import com.mashibing.prototype.demo03.AdvTemplate;

import java.util.Random;

public class Client {

    //发送邮件的数量
    private static final int MAX_COUNT = 6;

    //发送邮件方法
    public static void sendMail(Mail mail) {
        System.out.println("标题：" + mail.getSubject() + "\t收件人：" + mail.getReceive() + "\t内容：" + mail.getContext());
    }

    public static void main(String[] args) {
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XXX银行所有");
        Random random = new Random();
        while(i<MAX_COUNT){
            Mail clone = (Mail) mail.clone();
            clone.setReceive(random.nextInt(999999999)+"@mashibing.com");
            sendMail(clone);
            i++;
        }
    }
}
