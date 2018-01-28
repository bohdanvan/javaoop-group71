package com.bvan.javaoop.lessons1_2.dynamic_array.oop;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class DynamicArray {

    private int[] elems; // fields
    private int size;

    public DynamicArray(int initSize) {
        elems = new int[initSize];
        size = 0;
    }

    public void addLast(int n) {
        if (size == elems.length) {
            int newLength = (int) (1.5 * elems.length);
            elems = Arrays.copyOf(elems, newLength);
        }
        elems[size] = n;
        size++;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(elems, size));
    }
}
