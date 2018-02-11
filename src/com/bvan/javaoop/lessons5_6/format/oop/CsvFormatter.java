package com.bvan.javaoop.lessons5_6.format.oop;

import com.bvan.javaoop.lessons5_6.format.Product;

/**
 * @author bvanchuhov
 */
public class CsvFormatter implements Formatter {

    private final String delimiter;

    public CsvFormatter(String delimiter) {
        this.delimiter = delimiter;
    }

    public CsvFormatter() {
        this(",");
    }

    @Override
    public String format(Product product) {
        return product.getName() + delimiter + product.getPrice();
    }
}
