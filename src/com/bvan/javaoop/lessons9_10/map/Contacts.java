package com.bvan.javaoop.lessons9_10.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author bvanchuhov
 */
public class Contacts {

    public static void main(String[] args) {
        Map<String, PhoneNumber> contacts = new LinkedHashMap<>();
        // HashMap - random order
        // LinkedHashMap - adding order
        // TreeMap - sorted order

        contacts.put("Ira", new PhoneNumber("+380957778899"));
        contacts.put("Taras", new PhoneNumber("+380951112233")); // O(1)
        contacts.put("Maria", null);
        contacts.put("Ivan", new PhoneNumber("+380954445566"));

        contacts.put("Ivan", new PhoneNumber("+380501111111"));

        PhoneNumber ivanPhone = contacts.get("Ivan"); // O(1)
        System.out.println(ivanPhone);

        PhoneNumber mariaPhone = contacts.get("Maria");
        System.out.println(mariaPhone);

        System.out.println(contacts.containsKey("Maria"));
        System.out.println();

        Set<String> names = contacts.keySet();
        System.out.println(names);
        System.out.println();

        Collection<PhoneNumber> phoneNumbers = contacts.values();
        System.out.println(phoneNumbers);
        System.out.println();

        Set<Map.Entry<String, PhoneNumber>> entries = contacts.entrySet();
        for (Map.Entry<String, PhoneNumber> entry : entries) {
            String name = entry.getKey();
            PhoneNumber phoneNumber = entry.getValue();
            System.out.println(name + " -> " + phoneNumber);
        }
    }
}

class PhoneNumber {

    private final String phone;

    public PhoneNumber(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "phone='" + phone + '\'' +
                '}';
    }
}