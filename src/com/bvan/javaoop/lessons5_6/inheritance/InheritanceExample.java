package com.bvan.javaoop.lessons5_6.inheritance;

/**
 * @author bvanchuhov
 */
public class InheritanceExample {

    public static void main(String[] args) {
        Developer dev = new Developer("Boris", 40, "Google");
        dev.sayHello(); // I'm developer from Google
        dev.writeCode();
        System.out.println();

        Person p2 = new Developer("Grisha", 30, "Amazon");
        p2.sayHello(); // I'm developer from Amazon
    }
}












