package com.java.HomeWork;

import java.text.DecimalFormat;
import java.util.Scanner;

public class class10one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("HEIGHT CALCULATOR");
        System.out.println("Please input your height in meters: ");
        double meters = sc.nextDouble();
        System.out.println(metersToInches(meters));
    }

    private static String metersToInches(double height) {

        int feet = (int) (height / 0.0254 / 12);
        String inches = new DecimalFormat("#,##").format((height / 0.0254 - 12 * feet));
        String output = "Your height is " + feet + "'" + inches + "\"";
        return output;
    }
}

