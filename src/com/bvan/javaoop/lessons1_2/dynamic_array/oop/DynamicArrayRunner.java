package com.bvan.javaoop.lessons1_2.dynamic_array.oop;

/**
 * @author bvanchuhov
 */
public class DynamicArrayRunner {

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(10);

        dynamicArray.addLast(10);
        dynamicArray.addLast(20);
        dynamicArray.addLast(30);
        dynamicArray.addLast(40);
        dynamicArray.addLast(50);

        System.out.println(dynamicArray.toString());
    }
}
