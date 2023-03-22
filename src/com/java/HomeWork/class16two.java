package com.java.HomeWork;

import java.util.Scanner;

public class class16two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of count divisors: ");
        int number = sc.nextInt();
        countDivisors(number);
    }
    public static void  countDivisors(int number){
        int counter = 0;
        for (int i = 1; i <= number; i++){
            if (number % i == 0){
                counter++;
            }
        }
        System.out.println("Number of divisors " + counter);
    }
}
