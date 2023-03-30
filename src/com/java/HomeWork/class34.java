package com.java.HomeWork;

import java.util.Scanner;

public class class34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write number of month");
        String month = sc.next();

        if (month.equals("1") || month.equals("3") || month.equals("5")
                || month.equals("7") || month.equals("8") || month.equals("10")
                || month.equals("12")) {
            System.out.println("31 days");
        } else if (month.equals("4") || month.equals("6")
                || month.equals("9") || month.equals("11")) {
            System.out.println("30 days");
        } else if (month.equals("2")) {
            System.out.println("28 days");
        }
        throw new IllegalArgumentException("Please enter number between 1-12");
    }
}
