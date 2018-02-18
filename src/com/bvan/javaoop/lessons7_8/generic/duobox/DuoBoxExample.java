package com.bvan.javaoop.lessons7_8.generic.duobox;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class DuoBoxExample {

    public static void main(String[] args) {
        DuoBox<String, Integer> nameAndAge =
                new DuoBox<>("Taras", 25);

        DuoBox<String, String> firstAndLastName =
                new DuoBox<>("Ivan", "Ivaniv");

        List<List<String>> table = new ArrayList<>();
    }
}
