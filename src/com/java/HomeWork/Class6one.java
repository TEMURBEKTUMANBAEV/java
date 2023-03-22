package com.java.HomeWork;

import java.util.Scanner;

public class Class6one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short day = -1;
        while (!(day >= 0 && day <= 6)) {
            System.out.println("Please enter number of day (from 0 to 6): ");
            day = sc.nextShort();
            if (day==0) System.out.println("Sunday");
            else if ( day==1) System.out.println("Monday");
            else if ( day==2) System.out.println("Tuesday");
            else if ( day==3) System.out.println("Wednesday");
            else if ( day==4) System.out.println("Thursday");
            else if ( day==5) System.out.println("Friday");
            else if ( day==6) System.out.println("Saturday");
            else System.out.println("Invalid input. Try again.");
        }
    }
}
