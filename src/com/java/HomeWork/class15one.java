package com.java.HomeWork;

import java.util.Scanner;

public class class15one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the ATM Machine");
        System.out.println("Please enter your account opening balance: $");
        int balance = sc.nextInt();
        boolean clientExit = false;
        do {
            System.out.println("");
            System.out.println("Please select an option: ");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.println("");
            System.out.println("Enter your option: ");

            int option = sc.nextInt();
            switch (option){
                case  1:
                    System.out.println("Your balance is $" + balance);
                    break;
                case 2:
                    System.out.println("How much would you like to withdraw: $");
                    balance -= sc.nextInt();
                    System.out.println("Please take your $" + balance);
                    System.out.println("Your new balance is $" + balance);
                    break;
                case 3:
                    System.out.println("How much would you like to deposit: $");
                    balance += sc.nextInt();
                    System.out.println("Your new balance is $" + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM");
                    clientExit = true;
                    break;
                default:
                    System.out.println("Invalid option selected");
                    break;
            }
        } while (clientExit == false);
    }
}
