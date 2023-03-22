package com.java.HomeWork;

import java.util.Scanner;

public class class19one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int listofNumbers[] = new int[7];
        System.out.println("Enter 7 numbers: ");
        for (int i = 0; i < listofNumbers.length; i++){
            listofNumbers[i] = sc.nextInt();
        }
        System.out.println("The greatest number is: " + findTheGreatest(listofNumbers));
    }
    public static int findTheGreatest(int[] numbers){
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }
}
