package com.java.HomeWork;

public class class16five {
    public static void main(String[] args) {
        System.out.println("Sum of numbers from 1 to 10:");
        sumOnToTen();
    }
    public static void sumOnToTen(){
        int sum = 0;
        for (int i = 1, j = 10; i <= 5; i++, j--){
            sum += j + i;
        }
        System.out.println(sum);
    }
}
