package com.java.HomeWork;

import java.util.Arrays;

public class class21four {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 1};

        // Sorting the array using for-each loop
        Arrays.sort(arr);

        // Printing the sorted array
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}