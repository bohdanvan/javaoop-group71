package com.bvan.javaoop.lessons1_2.person.oop;

/**
 * @author bvanchuhov
 */
public class Person {

    // fields
    private final String name;
    private final int age;

    // constructor
    public Person(String name, int age) {
        if (!isAge(age)) {
            throw new IllegalArgumentException("illegal age: " + age);
        }

        this.name = name;
        this.age = age;
    }

    private boolean isAge(int n) {
        return n >= 0 && n <= 120;
    }

    public Person(String name) {
        this(name, 0);
    }

    public String sayHello() {
        return "Hello, I'm " + name + ", "
                + age + " years old";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person changeAge(int age) {
        return new Person(this.name, age);
    }

//    public void setAge(int age) { // BAD STYLE
//        if (!isAge(age)) {
//            throw new IllegalArgumentException("illegal age: " + age);
//        }
//        this.age = age;
//    }
}
