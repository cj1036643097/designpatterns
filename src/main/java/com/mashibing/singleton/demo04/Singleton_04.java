package com.mashibing.singleton.demo04;


/**
 * 双重锁校验
 */
public class Singleton_04 {
    private static volatile Singleton_04 instance;
    private Singleton_04(){}

    public static Singleton_04 getInstance(){
        if(instance == null){
            synchronized(Singleton_04.class){
                if (instance == null){
                    instance = new Singleton_04();
                }
            }
        }
        return instance;
    }
}
