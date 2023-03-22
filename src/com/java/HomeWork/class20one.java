package com.java.HomeWork;

import java.util.Scanner;

public class class20one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 5 numbers: ");
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++){
            System.out.println(i+1 + " number: ");
            numbers [i] = sc.nextInt();
        }
        int[] reversedNumbers = reverseArray(numbers);
        System.out.println("Reverse array:");
        for (int i = 0; i < reversedNumbers.length; i++){
            System.out.println(reversedNumbers[i]+"");
        }
    }
    public static int[] reverseArray(int[] nums){
        int[] reversedNums = new int[nums.length];
        for (int i = 0, j = reversedNums.length - 1; i < 5; i++, j--){
            reversedNums[i] = nums[j];
        }
        return reversedNums;
    }
}
