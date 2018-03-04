package com.bvan.javaoop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class CurrentThreadExample {

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.toString());
    }
}
