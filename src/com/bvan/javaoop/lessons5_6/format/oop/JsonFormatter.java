package com.bvan.javaoop.lessons5_6.format.oop;

import com.bvan.javaoop.lessons5_6.format.Product;

/**
 * @author bvanchuhov
 */
public class JsonFormatter implements Formatter {

    @Override
    public String format(Product product) {
        return "{\"name\": \"" + product.getName() + "\", \"price\": " + product.getPrice() + "}";
    }
}
