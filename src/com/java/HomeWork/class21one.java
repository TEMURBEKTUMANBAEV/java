package com.java.HomeWork;

import java.util.Scanner;

public class class21one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the first array
        System.out.println("Enter the number of rows and columns for the first array:");
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();
        int[][] arr1 = new int[rows1][cols1];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                arr1[i][j] = scanner.nextInt();
            }
        }

        // Taking input for the second array
        System.out.println("Enter the number of rows and columns for the second array:");
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();
        int[][] arr2 = new int[rows2][cols2];

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                arr2[i][j] = scanner.nextInt();
            }
        }

        // Checking if the two arrays can be added
        if (rows1 != rows2 || cols1 != cols2) {
            System.out.println("Error: The two arrays must have the same dimensions to be added.");
            return;
        }

        // Adding the two arrays
        int[][] sum = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        // Printing the sum
        System.out.println("The sum of the two arrays is:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}