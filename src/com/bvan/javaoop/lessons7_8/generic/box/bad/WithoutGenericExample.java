package com.bvan.javaoop.lessons7_8.generic.box.bad;

import com.bvan.javaoop.lessons7_8.generic.box.Cat;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class WithoutGenericExample {

    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("Hello");
        list.add(1);
        list.add(new Cat());
    }
}
