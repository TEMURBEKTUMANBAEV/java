package com.java.class39;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> setOfWords = new HashSet<>();


        System.out.println("Enter any String");
        String str = scanner.nextLine().replace(",", "");

        String[] arrayOfWords = str.split(" ");

        for (int i = 0; i < arrayOfWords.length; i++) {
            if (!setOfWords.add(arrayOfWords[i])) {
                setOfWords.remove(arrayOfWords[i]);
            }
        }
        System.out.println(setOfWords);
    }

}
