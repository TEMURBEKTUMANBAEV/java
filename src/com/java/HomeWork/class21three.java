package com.java.HomeWork;

import java.util.Scanner;
public class class21three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the array elements separated by spaces:");
        String input = scanner.nextLine();
        String[] elements = input.split(" ");
        int[] arr = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            arr[i] = Integer.parseInt(elements[i]);
        }

        int min = arr[0];
        int max = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        int sum = min + max;
        System.out.println("The sum of the smallest and largest numbers in the array is: " + sum);
    }
}
