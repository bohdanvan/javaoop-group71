package com.bvan.javaoop.lessons3_4;

import com.bvan.javaoop.lessons3_4.rectangle.Rectangle;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        list.add(10);
        list.add(20);
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        System.out.println(list);
    }
}
