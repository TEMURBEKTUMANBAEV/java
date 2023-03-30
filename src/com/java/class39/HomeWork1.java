package com.java.class39;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter five numbers");
        for (int i = 0; i < 5; i++) {
          numbers.add(sc.nextInt());
        }
        Collections.sort(numbers);
        System.out.println(numbers);

    }
}
