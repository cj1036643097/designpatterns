package com.mashibing.proxy.cglib;

import com.mashibing.proxy.IUserDao;
import com.mashibing.proxy.UserDaoImpl;

/**
 * 基于cgLib的动态代理
 */
public class Client {
    public static void main(String[] args) {
        UserDaoImpl userDao = new UserDaoImpl();
        System.out.println(userDao.getClass());
        IUserDao userDaoProxy = (IUserDao) new UserLogProxy(userDao).getProxyInstance();
        userDaoProxy.save();
    }
}
