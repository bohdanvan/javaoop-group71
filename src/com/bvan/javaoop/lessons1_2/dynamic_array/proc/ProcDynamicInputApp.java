package com.bvan.javaoop.lessons1_2.dynamic_array.proc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class ProcDynamicInputApp {

    public static void main(String[] args) {
        int[] elems = readClientElemsFromConsole();

        System.out.println(Arrays.toString(elems));
        System.out.println("Goodbye");
    }

    public static int[] readClientElemsFromConsole() {
        Scanner scanner = new Scanner(System.in);

        int[] elems = new int[4];
        int size = 0;

        int n = readClientElem(scanner);
        while (n != 0) {
            if (size == elems.length) {
                int newLength = (int)(1.5 * elems.length);
                elems = Arrays.copyOf(elems, newLength);
            }
            elems[size] = n;
            size++;

            n = readClientElem(scanner);
        }
        return Arrays.copyOf(elems, size);
    }

    public static int[] addLastElem(int[] elems, int n) {
        int[] newElems = Arrays.copyOf(elems, elems.length+1);
        newElems[newElems.length-1] = n;
        return newElems;
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
