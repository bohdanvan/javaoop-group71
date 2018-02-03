package com.bvan.javaoop.lessons3_4.rectangle;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class Rectangles {

    private ArrayList<Rectangle> rectangles = new ArrayList<>();

    public void add(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public double getArea() {
        double sumArea = 0.0;
        for (Rectangle rectangle : rectangles) {
            sumArea += rectangle.getArea();
        }
        return sumArea;
    }
}
