package com.java.class41;

public class example1 {
    public static void main(String[] args) {
      int number = 10;
      int a = 0;
      int b = 1;
      for(int i = 1; i < number; i++) {
          int fibonacci = a+b;
          a = b;
          b = fibonacci;
          System.out.println(fibonacci);
      }

    }
}
