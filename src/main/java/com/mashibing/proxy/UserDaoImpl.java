package com.mashibing.proxy;

public class UserDaoImpl implements IUserDao{
    @Override
    public void save() {
        System.out.println("数据保存成功");
    }
}
