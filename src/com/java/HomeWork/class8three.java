package com.java.HomeWork;

import java.util.Scanner;
public class class8three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter shipping country:");
        String country = sc.nextLine();
        System.out.println("Please, enter weight of your item in lbs:");
        int weight = sc.nextInt();
        if (country.equalsIgnoreCase("United States")||country.equals("US")){
            if(weight < 2){
                double cost = 0;
                cost = weight * 5;
                System.out.println("Your shipping cost is: " + cost);
            } else if (weight >= 2) {
                double cost = 0;
                cost = weight * 0.5;
                System.out.println("Your shipping cost is: " + cost);
                }
            } else {
            double cost = 0;
            cost = weight * 1.5;
            System.out.println("Your shipping cost is: " + cost);
        }
        }
    }

