package com.mashibing.proxy;

public class TestProxy {
    public static void main(String[] args) {
        // 静态代理
        IUserDao iUserDao = new UserDaoImpl();
        IUserDao userDaoProxy = new UserDaoProxy(iUserDao);
        userDaoProxy.save();

        IUserDao instance = (IUserDao) new ProxyFactory(new UserDaoImpl()).getProxyInstance();
        instance.save();

    }
}
