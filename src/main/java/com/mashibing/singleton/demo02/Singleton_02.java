package com.mashibing.singleton.demo02;


/**
 * 懒汉模式（线程安全）
 */
public class Singleton_02 {

    private static Singleton_02 singleton02 = null;

    private Singleton_02(){
    }

    public static synchronized Singleton_02 getInstance(){
        if(singleton02 == null){
            singleton02 = new Singleton_02();
        }
        return singleton02;
    }
}
