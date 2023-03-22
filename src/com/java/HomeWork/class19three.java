package com.java.HomeWork;

import java.util.Scanner;

public class class19three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] listofNumbers = new int[7];
        System.out.println("Enter 7 numbers: ");
        for (int i = 0; i < listofNumbers.length; i++){
            listofNumbers[i] = sc.nextInt();
        }
        int[] negativeAndPositive =countNegativeAndPositive (listofNumbers);
        System.out.println("The sum of even numbers is: " + negativeAndPositive[0]);
        System.out.println("The sum of odd numbers is: " + negativeAndPositive[1]);
    }
    public static int[] countNegativeAndPositive(int[] numbers){
        int [ ] negativeAndPositive = new int[2];
        for (int i : numbers){
            if (i > 0){
                negativeAndPositive[0]++;
            } else {
                negativeAndPositive[1]++;
            }
        }
        return negativeAndPositive;
    }
}
