package com.bvan.javaoop.lessons1_2.dynamic_array.oop;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class OOPDynamicInputApp {

    public static void main(String[] args) {
        DynamicArray elems = readClientElemsFromConsole();

        System.out.println(elems.toString());
        System.out.println("Goodbye");
    }

    public static DynamicArray readClientElemsFromConsole() {
        Scanner scanner = new Scanner(System.in);

        DynamicArray elems = new DynamicArray(10);

        int n = readClientElem(scanner);
        while (n != 0) {
            elems.addLast(n);

            n = readClientElem(scanner);
        }
        return elems;
    }

    public static int readClientElem(Scanner scanner) {
        System.out.print(">> ");
        while (!scanner.hasNextInt()) {
            scanner.next(); // skip

            System.out.println("Sorry, illegal input");
            System.out.print(">> ");
        }

        return scanner.nextInt();
    }
}
