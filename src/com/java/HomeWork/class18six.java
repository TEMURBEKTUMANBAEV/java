package com.java.HomeWork;

public class class18six {
        public static void main(String[] args) {
            printTree(5);
        }

        public static void printTree(int num){
            for (int i = num; i >= 1; i--){
                for (int j = 1; j <= num - i; j++){
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++){
                    System.out.print(" *");
                }
                System.out.println();
            }
        }
}
