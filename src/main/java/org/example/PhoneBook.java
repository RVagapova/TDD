package org.example;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private static final Map<String, String> phoneBook = new TreeMap<>();

    public static int add(String name, String number) {
        if (phoneBook.containsKey(name)) {
            System.out.println("Такое имя уже добавлено в книгу");
        } else {
            phoneBook.put(name, number);
        }
        return phoneBook.size();
    }

    public static String findByNumber(String number) {
        String result = null;
        for (Map.Entry<String, String> item : phoneBook.entrySet()) {
            if (item.getValue().equals(number)) {
                result = item.getKey();
                break;
            }
        }
        return result;
    }

    public static String findByName(String name) {
        return phoneBook.get(name);
    }

    public static String[] printAllNames() {
        String[] names = new String[phoneBook.size()];
        int i = 0;
        for (String name : phoneBook.keySet()) {
            names[i] = name;
            System.out.print(names[i] + " ");
            i++;
        }
        return names;
    }
}
