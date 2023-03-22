package com.java.HomeWork;
public class class10two {
    public static void main(String[] args) {
        System.out.println(passingExam('A'));
        System.out.println(passingExam('D'));
        System.out.println(passingExam('H'));
    }

    private static boolean passingExam(char grade) {
        boolean passing = false;
        switch (grade){
            case 'A': case 'B': passing = true; break;
            case 'C': case 'D': case 'F': passing = false; break;
            default:
                System.out.println("Wrong grade! Try again!");
        }
        return passing;
    }
}
