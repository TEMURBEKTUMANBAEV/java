package com.java.HomeWork;

import java.util.Scanner;

public class class18one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Number of vowels in the string is: " + countVowels(str));
    }
    public static int countVowels(String str){
        int counter = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                counter++;
            }
        }
        return  counter;
    }
}
