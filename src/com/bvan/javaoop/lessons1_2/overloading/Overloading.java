package com.bvan.javaoop.lessons1_2.overloading;

/**
 * @author bvanchuhov
 */
public class Overloading {

    public static void main(String[] args) {
        String sum = sum("Hello ", "Java");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static String sum(String a, String b) {
        return a + b;
    }
}
