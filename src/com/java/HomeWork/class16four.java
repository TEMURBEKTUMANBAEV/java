package com.java.HomeWork;

public class class16four {
    public static void main(String[] args) {
        System.out.println("Sum of numbers from 1 to 10:");
        sumOneToTen();
    }
    public static void sumOneToTen(){
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            if (i % 3 == 0){
                sum -= i;
            } else {
                sum += i;
            }
            }
        System.out.println(sum);
        }
    }

