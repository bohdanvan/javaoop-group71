package com.bvan.javaoop.lessons3_4.shape;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Shapes {

    private List<Shape> shapes = new LinkedList<>();

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public Shape get(int index) {
        return shapes.get(index);
    }

    public double getArea() {
        double areaSum = 0.0;
        for (Shape shape : shapes) {
            areaSum += shape.getArea();
        }
        return areaSum;
    }
}
