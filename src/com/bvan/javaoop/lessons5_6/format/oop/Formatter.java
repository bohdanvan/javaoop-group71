package com.bvan.javaoop.lessons5_6.format.oop;

import com.bvan.javaoop.lessons5_6.format.Product;

/**
 * @author bvanchuhov
 */
public interface Formatter {

    String format(Product product);

    default void print(Product product) {
        String s = format(product);
        System.out.println(s);
    }
}
