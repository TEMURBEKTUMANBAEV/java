package com.java.HomeWork;

import java.util.Scanner;

public class Class4two {
    public static void main(String[] args) {
        //Homework: Scanner.
//Write a credit landing program
//get user input for age, creditscore, marital status

//printout Approved: true
//if user is older than 25
//if user has a creditscore more than 700
//if user is married


//printout Approved: false
//if any of the conditions is wrong

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("your name is " + name);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        System.out.println("your age is " + age);
        System.out.println("Enter your marital status: ");
        String status = scan.next();
        System.out.println("your status is " + status);
        System.out.println("Enter your credit Score: ");
        int score = scan.nextInt();
        System.out.println("your credit score is " + score);
        boolean approved = age > 25 && score > 700 && status.equals("married");
        System.out.println("Approved: " + approved);
    }
}
