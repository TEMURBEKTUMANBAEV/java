package com.java.HomeWork;

import java.util.Scanner;
public class class32one {
        enum Day {
            Sunday(0), Monday(1), Tuesday(2), Wednesday(3), Thursday(4), Friday(5), Saturday(6);
            private int value;
            private Day(int value) {
                this.value = value;
            }
            public int getValue() {
                return value;
            }
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a day number from 0 to 6: ");
            int dayNumber = scanner.nextInt();

            Day day = null;

            switch (dayNumber) {
                case 0:
                    day = Day.Sunday;
                    break;
                case 1:
                    day = Day.Monday;
                    break;
                case 2:
                    day = Day.Tuesday;
                    break;
                case 3:
                    day = Day.Wednesday;
                    break;
                case 4:
                    day = Day.Thursday;
                    break;
                case 5:
                    day = Day.Friday;
                    break;
                case 6:
                    day = Day.Saturday;
                    break;
                default:
                    System.out.println("Invalid day number");
                    System.exit(0);
            }

            System.out.println("The day is " + day);

            scanner.close();
        }
    }
