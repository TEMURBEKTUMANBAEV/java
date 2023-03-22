package com.java.HomeWork;

import java.util.Scanner;

public class Class4one {
    public static void main(String[] args) {
        //Login Functionality
    //Write a logic which would tell the user if logged in or not
//you have a username
//you have a password
//you loginLocation

//in order to be logged your userName should match steve@apple.com
//and your password should be infinityLoop1
//and you location should be california
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter your username: ");
        String userName = scan.next();
        System.out.println("Enter your password: ");
        String password = scan.next();
        System.out.println("Enter your location: ");
        String loginLocation = scan.next();

        boolean logIn = userName.equals("temurbektumanbaev638@gmail.com") && loginLocation.equals("California");
        System.out.println(logIn);

    }
}
