package com.java.HomeWork;

import java.util.Scanner;

public class class17three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sum of each digit in number: ");
        sumOfEachDigitImNumber(sc.nextInt());
    }
    public static void sumOfEachDigitImNumber(int num){
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
