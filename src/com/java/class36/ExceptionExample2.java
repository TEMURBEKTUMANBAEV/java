package com.java.class36;

public class ExceptionExample2 {
    public static void main(String[] args) {
        String myString = null;
        int[] myArray = {1, 2, 3, 4};
        
        try {
            int value = myArray[4];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
        }
        try {
            int length = myString.length();
        } catch (NullPointerException e) {
            System.out.println("Error: String is null");
        }
    }
}
