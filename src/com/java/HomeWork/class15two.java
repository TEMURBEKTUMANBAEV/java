package com.java.HomeWork;

public class class15two {
    public static void main(String[] args) {
        System.out.println("Counting down from 10 to 1:");
        countDown();
    }
    public static void countDown(){
        int counter = 10;
        do {
            System.out.println(counter--);
        }while (counter > 0);
    }
}
