package com.java.HomeWork;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class class36 {
    public static void main(String[] args) {
        String str = "This is my collection program";
        printUniqueWords(str);
        printCharFrequency(str);
    }

    public static void printUniqueWords(String str) {
        System.out.println("Task#1");
        String[] words = str.split("[\\s]+");
        Set<String> allWords = new HashSet<>();
        Set<String> duplicateWords = new HashSet<>();
        for (String word : words) {
            if (!allWords.add(word)) {
                duplicateWords.add(word);
            }
        }
        allWords.removeAll(duplicateWords);
        System.out.println("Unique words: " + allWords);
    }

    public static void printCharFrequency(String str) {
        System.out.println("Task#2");
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                continue;
            }
            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            } else {
                frequencyMap.put(c, 1);
            }
        }
        System.out.println("Character frequency: " + frequencyMap);
    }
}

    

