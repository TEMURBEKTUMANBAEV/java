package com.java.HomeWork;

public class class14one {
    public static void main(String[] args) {
        System.out.println("The sum of all even numbers between 1 and 100 is: " + sumEvenNumbers());
    }
    public static  int sumEvenNumbers(){
        int i = 0;
        int sum = 0;
        while (i < 100){
            sum += i;
            i += 2;
        }
        return  sum;
    }
}
