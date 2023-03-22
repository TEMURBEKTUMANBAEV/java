package com.java.HomeWork;

public class class27one {

    public void printMessage(int num) {
        System.out.println("The number is: " + num);
    }

    public void printMessage(String str) {
        System.out.println("The string is: " + str);
    }

    public void printMessage(double num1, double num2) {
        System.out.println("The sum is: " + (num1 + num2));
    }

    public static void main(String[] args) {
        class27one obj = new class27one();
        obj.printMessage(10);
        obj.printMessage("Hello");
        obj.printMessage(2.5, 3.5);
    }
}
