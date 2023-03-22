package com.java.HomeWork;

public class class16three {
    public static void main(String[] args) {

        System.out.println("Magic numbers from 1 to 100: ");
        findMagicNumbers();
    }
    public static  void  findMagicNumbers(){
        for (int i = 1; i <= 100; i++){
            if (i % 5 == 4 && i % 4 == 3 && i % 3 == 2 && i % 2 == 1){
                System.out.println("Magic number is " + i);
            }
        }
    }
}
