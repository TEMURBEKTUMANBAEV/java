package com.java.HomeWork;

import java.util.Scanner;

public class class11one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the year: ");
        int year = sc.nextInt();
        System.out.println(isALeapYear(year));
    }
    public static boolean isALeapYear(int year){
        if (year % 4 ==0){
            return true;
        }
        else {
            return false;
        }
    }
}
