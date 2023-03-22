package com.java.HomeWork;

import java.util.Scanner;

public class class19two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] listofNumbers = new int[7];
        System.out.println("Enter 7 numbers: ");
        for (int i = 0; i < listofNumbers.length; i++){
            listofNumbers[i] = sc.nextInt();
        }
        int[] oddAndEven = findTheSum(listofNumbers);
        System.out.println("The sum of even numbers is: " + oddAndEven[0]);
        System.out.println("The sum of odd numbers is: " + oddAndEven[1]);
    }
    public static int[] findTheSum(int[] numbers){
        int[] oddAndEven = new int[2];
        for (int number : numbers){
            if (number % 2 == 0){
                oddAndEven [0] += number;
            } else {
                oddAndEven[1] += number;
            }

        }
        return oddAndEven;
    }
}
