package com.bvan.javaoop.lessons9_10.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author bvanchuhov
 */
public class LambdaExample {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 5, 3);

        for (Integer elem : list) {
            if (elem < 4) {
                elem = elem * 10;
                System.out.println(elem);
            }
        }
        System.out.println();

        Function<Integer, Integer> mult10 = x -> x * 10;
        System.out.println(mult10.apply(4));
        System.out.println();

        list.stream()
                .filter(x -> x < 4)
                .map(mult10)
                .forEach(LambdaExample::print);
    }

    public static void print(Integer x) {
        System.out.println(x);
    }
}
