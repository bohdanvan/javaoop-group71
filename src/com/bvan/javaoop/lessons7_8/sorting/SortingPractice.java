package com.bvan.javaoop.lessons7_8.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class SortingPractice {

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Vlad",
                "Ivan",
                "Boris",
                "Arnold",
                "Bob"
        );

        Collections.sort(names);
        System.out.println("Alphabetical, ASC: " + names);

        names.sort(Collections.reverseOrder());
        System.out.println("Alphabetical, DESC: " + names);

        names.sort(new LengthComparator());
        System.out.println("Length, ASC: " + names);

        names.sort(new LengthComparator().reversed());
        System.out.println("Length, DESC: " + names);
    }
}

class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
    }
}