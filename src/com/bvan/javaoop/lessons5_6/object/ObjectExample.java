package com.bvan.javaoop.lessons5_6.object;

/**
 * @author bvanchuhov
 */
public class ObjectExample {

    public static void main(String[] args) {
        Dog dog = new Dog("Rex");
        System.out.println(dog.toString());

        System.out.println(new Dog("Rex").equals(new Dog("Rex")));

        String s1 = "Hello";
        String s2 = new String("Hello");

        System.out.println("refs: " + (s1 == s2));
        System.out.println("content: " + s1.equals(s2));
    }
}

class Dog extends Object {

    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println("Gav-gav");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        return name != null ? name.equals(dog.name) : dog.name == null;
    }

    @Override
    public String toString() {
        return "Dog{}";
    }
}