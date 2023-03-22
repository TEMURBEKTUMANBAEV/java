package com.java.HomeWork;

import java.util.Scanner;

public class Class6two {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Beverly Hills!");
        System.out.println("Are you travelling first time here(true/false)? ");
        boolean firstTime = sc.hasNextBoolean();
        if (!firstTime) System.out.println("You have got a 10% discount on your stay.");
        System.out.println("Enjoy your stay here!");
    }
}
