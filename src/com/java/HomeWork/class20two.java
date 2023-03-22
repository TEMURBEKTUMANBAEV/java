package com.java.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class class20two{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayOfNumbers = new int[10];
        for (int i = 0; i < arrayOfNumbers.length; i++){
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            arrayOfNumbers[i] = num;
        }
        Arrays.sort(arrayOfNumbers);
        printOutDuplicateNumbers(arrayOfNumbers);
    }
    public static void printOutDuplicateNumbers(int[] numbers){
        System.out.println("Duplicate numbers: ");
        for (int i = 0; i < numbers.length -1; i++){
            if (numbers[i] == numbers[i + 1]){
                System.out.println(numbers[i] + " ");
            }
            try {
                while (numbers[i] == numbers[i + 1]){
                    i++;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                break;
            }
        }
    }
}
