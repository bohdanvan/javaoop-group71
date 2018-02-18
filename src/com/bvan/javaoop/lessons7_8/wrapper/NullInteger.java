package com.bvan.javaoop.lessons7_8.wrapper;

/**
 * @author bvanchuhov
 */
public class NullInteger {

    public static void main(String[] args) {
        Integer x = null;
        x++; // x = Integer.valueOf(x.intValue() + 1)
        System.out.println(x);
    }
}
