package com.java.HomeWork;

import java.util.Scanner;
public class Class5four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Kyrgyz AirLines!");
        System.out.println("Are you travelling from connecting flight(false/true): ");
        boolean connectingFlight = sc.nextBoolean();
        if (!connectingFlight) System.out.println("Please proceed to the security check!");
        System.out.println("Enjoy your flight.");
    }
}
