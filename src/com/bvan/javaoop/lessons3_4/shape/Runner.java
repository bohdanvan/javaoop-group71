package com.bvan.javaoop.lessons3_4.shape;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class Runner {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10.0, 20.0);
        double a1 = r.getArea();

        Circle c = new Circle(10.0);
        double a2 = c.getArea();

        Shape s1 = new Rectangle(10.0, 20.0);
        Shape s2 = new Circle(10.0);

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(s1);
        shapes.add(s2);
    }
}
