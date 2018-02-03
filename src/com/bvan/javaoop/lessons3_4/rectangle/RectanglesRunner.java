package com.bvan.javaoop.lessons3_4.rectangle;

/**
 * @author bvanchuhov
 */
public class RectanglesRunner {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10.0, 20.0);
        Rectangle r2 = new Rectangle(3.0, 1.0);

        Rectangles rectangles = new Rectangles();
        rectangles.add(r1); // S = 200
        rectangles.add(r2); // S = 3
        rectangles.add(new Rectangle(1, 20)); // S = 20

        System.out.println("Sum S = " + rectangles.getArea()); // S = 223
    }
}
