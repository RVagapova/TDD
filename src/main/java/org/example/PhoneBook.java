package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private static Map<String,String> phoneBook = new HashMap<>();

    public static int add(String name, String number) {
        if(phoneBook.containsKey(name)) {
            System.out.println("Такое имя уже добавлено в книгу");
        } else{
            phoneBook.put(name,number);
        }
        return phoneBook.size();
    }

    public static String findByNumber(String number) {
        return null;
    }
}
