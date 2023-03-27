package com.java.class37;

import java.util.Scanner;

public class Teenagers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();

            if (age > 100 || age <= 0){
                throw new ArithmeticException("Invalid Age Specified");
            }else if (age >= 13 && age <= 19){
                    System.out.println("Teenager");
                }else {
                    System.out.println("Not Teenager");
                }

            System.out.println("Enter your weight");
            int weight = sc.nextInt();

            if(weight * age >= 100){
                System.out.println("You are fit");
            }else{
                System.out.println("You are not fit");
            }
    }
}
