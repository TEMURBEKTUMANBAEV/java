package com.java.HomeWork;

import java.util.Scanner;

public class class9two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("CALCULATOR");
        System.out.println("Input type of operation (e.g +, -, *, /): ");
        String operation = sc.nextLine();
        String result = "Result of operation is ";
        System.out.println("Integer number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Integer number 2: ");
        int num2 = sc.nextInt();
        switch (operation){
            case "+": result += num1 + num2; break;
            case "-": result += num1 - num2; break;
            case "*": result += num1 * num2; break;
            case "/":
            if (num2 != 0) { result += (double) num1 / num2; break;}
            default:
                result = "Division by zero is not allowed";
        }
        System.out.println(result);
    }
}
