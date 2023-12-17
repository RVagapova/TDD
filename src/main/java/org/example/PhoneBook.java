package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private static final Map<String,String> phoneBook = new HashMap<>();

    public static int add(String name, String number) {
        if(phoneBook.containsKey(name)) {
            System.out.println("Такое имя уже добавлено в книгу");
        } else{
            phoneBook.put(name,number);
        }
        return phoneBook.size();
    }

    public static String findByNumber(String number) {
        String result = null;
        for (Map.Entry<String, String> item: phoneBook.entrySet()) {
            if(item.getValue().equals(number)) {
                result = item.getKey();
                break;
            }
        }
        return result;
    }

    public static String findByName(String name) {
        return null;
    }
}
