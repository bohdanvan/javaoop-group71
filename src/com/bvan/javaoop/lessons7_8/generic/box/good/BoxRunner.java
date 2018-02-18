package com.bvan.javaoop.lessons7_8.generic.box.good;

import com.bvan.javaoop.lessons7_8.generic.box.Cat;
import com.bvan.javaoop.lessons7_8.generic.box.Dog;

/**
 * @author bvanchuhov
 */
public class BoxRunner {

    public static void main(String[] args) {
        Box<Cat> catBox = new Box<>(new Cat());
        Box<Dog> dogBox = new Box<>(new Dog());
        Box<Box<String>> boxOfBoxes = new Box<>(new Box<>("Java"));

        sendBox(catBox);
    }

    private static void sendBox(Box<Cat> catBox) {
        Cat cat = catBox.get();
        cat.meow();
    }
}
