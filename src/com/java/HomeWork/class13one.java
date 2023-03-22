package com.java.HomeWork;

import java.util.Scanner;

public class class13one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print table");
        int num = sc.nextInt();
        int multiple = 1;
        while (multiple <= 10){
            int answer = num * multiple;
            System.out.println(num +"*"+ multiple + "=" + answer);
            multiple++;
        }
    }

}
