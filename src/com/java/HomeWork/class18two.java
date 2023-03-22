package com.java.HomeWork;

import java.util.Scanner;

public class class18two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Reverse string is: " + reverse(str));
    }
    public static String reverse(String str){
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        return  reverse;
    }
}
