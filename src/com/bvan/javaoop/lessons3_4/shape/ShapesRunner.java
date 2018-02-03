package com.bvan.javaoop.lessons3_4.shape;

/**
 * @author bvanchuhov
 */
public class ShapesRunner {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        Circle c = new Circle(10);

        Shapes shapes = new Shapes();
        shapes.add(c); // 314
        shapes.add(r); // 200
        shapes.add(new EquilateralTriangle(10.0)); // 43

        double area = shapes.getArea();
        System.out.println(area); // 514

        Shape shape = shapes.get(0);
        if (shape instanceof  Rectangle) {
            Rectangle r2 = (Rectangle) shape;
            System.out.println(r2.getWidth());
        }
    }
}
