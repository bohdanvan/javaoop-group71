package com.bvan.javaoop.lessons5_6.format.oop;

import com.bvan.javaoop.lessons5_6.format.Product;

/**
 * @author bvanchuhov
 */
public class CartRunner {

    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Product("MacBook", 2000));
        cart.add(new Product("Lenovo", 1500));
        cart.add(new Product("Asus", 1700));

        Formatter nameFormatter = new NameFormatter();
        cart.print(nameFormatter);
        System.out.println();

        cart.print(new CsvFormatter(" "));
        System.out.println();

        cart.print(new JsonFormatter());
        System.out.println();

        Formatter toStringFormatter = toStringFormatter();
        cart.print(toStringFormatter);
    }

    public static Formatter jsonFormatter() {
        return new JsonFormatter();
    }

    public static Formatter toStringFormatter() {
        // anonymous class
        return new Formatter() {
            @Override
            public String format(Product product) {
                return product.toString();
            }
        };
    }
}
