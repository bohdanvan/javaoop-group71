package com.bvan.javaoop.lessons9_10.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author bvanchuhov
 */
public class TreeMapExample {

    public static void main(String[] args) {
        SortedMap<String, PhoneNumber> contacts = new TreeMap<>();

        contacts.put("Anna", new PhoneNumber("+380957778899"));
        contacts.put("Boris", new PhoneNumber("+380951112233")); // O(1)
        contacts.put("Bill", new PhoneNumber("+380951111111"));
        contacts.put("Aaron", new PhoneNumber("+380954445566"));
        contacts.put("Serhey", new PhoneNumber("+380954445566"));

        System.out.println(contacts.lastKey());
        System.out.println(contacts.firstKey());

        System.out.println(contacts.subMap("B", "C"));
        System.out.println(contacts.headMap("C"));
    }
}
