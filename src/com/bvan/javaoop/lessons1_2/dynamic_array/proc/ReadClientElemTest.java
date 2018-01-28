package com.bvan.javaoop.lessons1_2.dynamic_array.proc;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class ReadClientElemTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = ProcDynamicInputApp.readClientElem(scanner);
        System.out.println(n);
    }
}
