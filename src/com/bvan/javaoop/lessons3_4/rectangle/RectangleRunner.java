package com.bvan.javaoop.lessons3_4.rectangle;

/**
 * @author bvanchuhov
 */
public class RectangleRunner {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10.0, 20.0);
        System.out.println("w = " + r1.getWidth());
        System.out.println("h = " + r1.getHeight());
        System.out.println("P = " + r1.getPerimeter());
        System.out.println("S = " + r1.getArea());

//        System.out.println(r1);
        System.out.println(r1.toString());

        Rectangle square = Rectangle.createSquare(10.0);
    }
}
