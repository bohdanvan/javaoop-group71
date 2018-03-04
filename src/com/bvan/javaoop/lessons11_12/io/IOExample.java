package com.bvan.javaoop.lessons11_12.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class IOExample {

    public static void main(String[] args) {
        // 1. Create a stream (+)
        // 2. Work with the stream (+)
        // 3. Close the stream

        String file = "files/names.txt";
        String outFile = "files/hello.txt";
        try {
            List<String> names = readNamesFromFile(file);
            writeNamesIntoFile(names, outFile);
            System.out.println(names);
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, file is not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Sorry, error: " + e.getMessage());
        }
    }

    public static void writeNamesIntoFile(List<String> names, String file) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            for (String name : names) {
                writer.write(helloMessage(name));
                writer.newLine();
            }
        }
    }

    public static String helloMessage(String name) {
        return "Hello, " + name + "!";
    }

    public static String readNameFromFile(String file) throws IOException {
        // Java 7: try-with-resources
        try (BufferedReader reader =
                     new BufferedReader(new FileReader(file))) {

            return reader.readLine();
        }
    }

    public static List<String> readNamesFromFile(String file) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            List<String> names = new ArrayList<>();

            String name;
            while ((name = reader.readLine()) != null) {
                names.add(name);
            }
            return names;
        }
    }

    public static String readNameFromFileOld(String file) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            return reader.readLine();
        } finally {
            closeReader(reader);
        }
    }

    private static void closeReader(BufferedReader reader) {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
