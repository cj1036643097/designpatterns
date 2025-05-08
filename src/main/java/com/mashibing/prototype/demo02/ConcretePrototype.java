package com.mashibing.prototype.demo02;

import lombok.Data;

import java.io.*;

@Data
public class ConcretePrototype implements Serializable {

    private Person person;

    public void show(){
        System.out.println(person);
    }


    @Data
    public static class Person  implements Serializable {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

}
