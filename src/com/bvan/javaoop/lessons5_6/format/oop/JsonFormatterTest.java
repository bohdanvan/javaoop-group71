package com.bvan.javaoop.lessons5_6.format.oop;

import com.bvan.javaoop.lessons5_6.format.Product;

/**
 * @author bvanchuhov
 */
public class JsonFormatterTest {

    public static void main(String[] args) {
        JsonFormatter formatter = new JsonFormatter();
        String s = formatter.format(new Product("Asus", 1700));
        System.out.println(s);
    }
}
