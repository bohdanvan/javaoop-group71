package com.bvan.javaoop.lessons1_2.person.oop;

/**
 * @author bvanchuhov
 */
public class PersonRunner {

    public static void main(String[] args) {
        Person taras = new Person("Taras", 20);
        String tarasInfo = taras.sayHello();
        System.out.println(tarasInfo);
        System.out.println(taras.getName());

        Person vlad = new Person("Vlad", 30);
        String vladInfo = vlad.sayHello();
        System.out.println(vladInfo);
    }
}
