package com.java.HomeWork;

import java.util.Scanner;

public class class17five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        System.out.println("Reverse number is: " + reverse(sc.nextInt()));
    }
    public static int reverse(int num){
        int reverse = 0;
        while (num > 0){
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        return reverse;
    }
}
