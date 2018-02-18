package com.bvan.javaoop.lessons7_8.sorting;

import java.time.LocalDate;

/**
 * @author bvanchuhov
 */
public class ComparingExample {

    public static void main(String[] args) {
        System.out.println("Int:");
        System.out.println(Integer.compare(10, 20)); // < 0
        System.out.println(Integer.compare(40, 20)); // > 0
        System.out.println(Integer.compare(10, 10)); // 0
        System.out.println();

        System.out.println("String:");
        System.out.println("ABCD".compareTo("EFG")); // < 0
        System.out.println("Homework".compareTo("Hometown")); // > 0
        System.out.println("Home".compareTo("Homework79797")); // < 0
        System.out.println("Home".compareTo("Home")); //
        System.out.println();

        System.out.println("Date:");
        LocalDate d1 = LocalDate.of(1990, 10, 20);
        LocalDate d2 = LocalDate.of(1991, 8, 25);
        System.out.println(d1.compareTo(d2)); // > 0
    }
}
