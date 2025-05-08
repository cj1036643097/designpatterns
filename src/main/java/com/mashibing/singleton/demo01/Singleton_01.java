package com.mashibing.singleton.demo01;

/**
 * 饿汉
 */
public class Singleton_01 {

    private static Singleton_01 singleton01 = new Singleton_01();

    private Singleton_01(){

    }

    public static Singleton_01 getInstance(){
        return singleton01;
    }

}
