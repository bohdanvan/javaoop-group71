package com.bvan.javaoop.lessons9_10.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author bvanchuhov
 */
public class SetExample {

    public static void main(String[] args) {
        List<String> langs = langs();
        Set<String> uniqueLangs = new LinkedHashSet<>(langs);
        System.out.println(uniqueLangs);

        uniqueLangs.add("C#");

        System.out.println(uniqueLangs);

        System.out.println(uniqueLangs.contains("Java"));
    }

    public static List<String> langs() {
        return Arrays.asList(
                "Java",
                "JavaScript",
                "Kotlin",
                "C#",
                "JavaScript",
                "Java",
                "Haskell",
                "JavaScript",
                "Java",
                "JavaScript",
                "Haskell",
                "Java"
        );
    }
}
