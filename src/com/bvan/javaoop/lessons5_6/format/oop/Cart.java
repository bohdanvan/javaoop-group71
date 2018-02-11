package com.bvan.javaoop.lessons5_6.format.oop;

import com.bvan.javaoop.lessons5_6.format.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Cart {

    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void print(Formatter formatter) {
        for (Product product : products) {
            String s = formatter.format(product);
            System.out.println(s);
        }
    }
}
