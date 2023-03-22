package com.java.HomeWork;

import java.util.Scanner;

public class Class8one {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose between 2 option:");
        System.out.println("1: Main Course");
        System.out.println("2: Appetizer");
        System.out.println("3: drinks");
        String user = sc.nextLine();
        if (user.equalsIgnoreCase("Main Course") || user.equals("1")) {
            System.out.println("1: Lagman");
            System.out.println("2: New your Rib Eye steak");
            String mc = sc.nextLine();
            if (mc.equalsIgnoreCase("Lagman")) {
                System.out.println("Lagman ingredients");
            } else if (mc.equalsIgnoreCase("New York Rib Eye steak") || mc.equals("2")) {
                System.out.println("New York rib Eye steak ingredients");
            } else{
                System.out.println("Invalid Main Course");
            }
        }
        else if (user.equalsIgnoreCase("Appetizer")|| user.equals("2")){
            System.out.println("1: Spring rolls");
            System.out.println("2: Egg rolls");
            String app = sc.nextLine();
            if(app.equalsIgnoreCase("Spring rolls")||app.equals("1")){
                System.out.println("Spring rolls ingredients");
            } else if (app.equalsIgnoreCase("Egg rolls")||app.equals("2")){
                System.out.println("Egg roll ingredients");
            } else {
                System.out.println("Invalid appetizer");
            }
        } else if (user.equalsIgnoreCase("drinks")|| user.equals("3")) {
            System.out.println("1:Orange juice");
            System.out.println("2:Apple juice");
            System.out.println("3:Pineapple juice");
            String drinks = sc.nextLine();
            if(drinks.equalsIgnoreCase("Orange juice")||drinks.equals("1")){
                System.out.println("Orange juice ingredients");
            }else if (drinks.equalsIgnoreCase("Apple juice")||drinks.equals("2")){
                System.out.println("Apple juice ingredients");
            } else if(drinks.equalsIgnoreCase("Pineapple juice")){
                System.out.println("Pineapple juice ingredients");
            }else{
                System.out.println("Invalid Drinks ");
            }
        }
        else{
            System.out.println("Invalid Choice");
        }
    }
}

