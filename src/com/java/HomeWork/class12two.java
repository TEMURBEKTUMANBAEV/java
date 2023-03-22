package com.java.HomeWork;

import java.util.Scanner;

public class class12two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println(lastTwoLetterTriple(str));
    }
    public static String lastTwoLetterTriple(String str){
        str = str.substring(str.length()-2, str.length());
        return  str+str+str;
    }
}
