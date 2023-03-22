package com.java.HomeWork;

import java.util.Scanner;

public class class10three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to other coffee shop!");
        System.out.println("Are you a member of our loyalty program (true of false)?");
        boolean member = sc.nextBoolean();
        System.out.println("Please enter the cost of purchase: ");
        double purchase = sc.nextDouble();

        System.out.println("Final cost is " + discountCalculator(member, purchase));
    }

    private static double discountCalculator(boolean member, double costOfPurchase) {
        if (member) costOfPurchase *= 0.9;
        return costOfPurchase;
    }
}
