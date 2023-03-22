package com.java.HomeWork;

import java.util.Scanner;

public class class20three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++){
            int num = sc.nextInt();
            array[i] = num;
        }
        printOutArrayOddElement(array);
    }
    public static void printOutArrayOddElement(int[] array){
        System.out.println("Odd elements: ");
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0){
                System.out.println(array[i] + " ");
            }
        }
    }
}
