package com.mashibing.prototype.demo01;

public class MainTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype c1 = new ConcretePrototype();
        ConcretePrototype c2 = (ConcretePrototype) c1.clone();

        System.out.println(c1);
        System.out.println(c1.getObj());
        System.out.println(c2);
        System.out.println(c2.getObj());
        System.out.println(c1 == c2);
        System.out.println(c1.getObj() == c2.getObj());

    }
}
