package com.java.HomeWork;

import java.util.Scanner;

public class class12one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String string = sc.nextLine();
        System.out.println("Stars with \"hi\" - " + isStringStartsWithHi(string));
    }

    public static boolean isStringStartsWithHi(String string){
        return string.startsWith("hi");
    }
}
