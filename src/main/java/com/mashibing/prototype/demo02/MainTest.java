package com.mashibing.prototype.demo02;

import java.io.*;

/**
 * 深度克隆
 */
public class MainTest {
    public static void main(String[] args) throws Exception {
        ConcretePrototype c1 = new ConcretePrototype();
        c1.setPerson(new ConcretePrototype.Person("小明",12));

        //创建对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c.txt"));

        //将c1对象写到文件中
        oos.writeObject(c1);
        oos.close();

        //创建对象输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c.txt"));

        //读取对象
        ConcretePrototype c2 = (ConcretePrototype) ois.readObject();
        ConcretePrototype.Person o2 = c2.getPerson();

        //判断p1与p2是否是同一个对象
        System.out.println("p1和p2是同一个对象?" + (c1.getPerson() == o2));
        c1.show();
        c2.show();

    }
}
