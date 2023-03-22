package com.java.HomeWork;

import  java.util.Scanner;

public class Class5one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many exercises you loving per day?");
        System.out.println("Usually I solve: ");
        int exercises = sc.nextInt();
        if (exercises < 3)
            System.out.println("You're too lazy!");
        else if (exercises < 5)
            System.out.println("Good job, but you should do better!");
        else System.out.println("Great job! You are on the right track!");
    }
}
