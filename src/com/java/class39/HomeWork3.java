package com.java.class39;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> words = new HashSet<>();


        System.out.println("Enter any String");
        String str = scanner.nextLine();

       String[] listOfWords = str.split(" ");

       for( int i = 0; i < listOfWords.length; i++ ){
        words.add(listOfWords[i]);
       }

       System.out.println(words);
    }
}
