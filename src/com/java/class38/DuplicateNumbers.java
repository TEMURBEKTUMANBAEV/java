package com.java.class38;

import java.util.HashMap;
import java.util.Map;

//Find duplicate characters in the String
public class DuplicateNumbers {
    public static void main(String[] args) {
        String sc = "We are almost finishing java";
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < sc.length(); i++) {
            char ch = sc.charAt(i);
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 2);
            } else {
                charCountMap.put(ch, 1);
            }
        }
        System.out.println("Duplicate characters in the String \"" + sc + "\" are:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 0) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }
}
