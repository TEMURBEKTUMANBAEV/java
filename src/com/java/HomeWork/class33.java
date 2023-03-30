package com.java.HomeWork;

import java.util.Scanner;

public class class33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        try {
            System.out.println(num1 / num2);
        }catch (ArithmeticException e) {
            System.err.println("We can't divide to zero");
        }

        String str = null;
        try {
            System.out.println(str.length());
        } catch (Exception e) {
            System.err.println("String is empty");
        }
        int[] numbers ={10, 20, 30, 40, 50};

        try {
            int fifthNumber = numbers[5];
        }catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Out of Bound");
        }
    }
}
