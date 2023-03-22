package com.java.HomeWork;

import java.util.Scanner;

public class class21two {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the elements of the array (separated by commas):");
            String[] input = scanner.nextLine().split(",");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i].trim());
            }
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }

            System.out.println("The sum of the array is: " + sum);
        }
}
