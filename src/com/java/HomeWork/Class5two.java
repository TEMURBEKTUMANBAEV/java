package com.java.HomeWork;

import java.sql.SQLOutput;
import  java.util.Scanner;
public class Class5two {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("To find average of 3 numbers, follow instructions below.");
        System.out.println("Input 1: ");
        int num1 = sc.nextInt();
        System.out.println("Input 2: ");
        int num2 = sc.nextInt();
        System.out.println("Input 3: ");
        int num3 = sc.nextInt();
        double avg = (num1 + num2 + num3)/3;
        System.out.println("Output: " + avg );
    }
}
