package com.java.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class class20four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++){
            int num = sc.nextInt();
            array[i] = num;
        }
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
 }
}
