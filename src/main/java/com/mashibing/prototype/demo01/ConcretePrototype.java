package com.mashibing.prototype.demo01;

import lombok.Data;

@Data
public class ConcretePrototype implements Cloneable{
    private Object obj = new Object();


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
