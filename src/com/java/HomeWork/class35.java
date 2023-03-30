package com.java.HomeWork;

import java.util.*;

public class class35 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write 5 numbers");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            numbers.add(num);
        }
        Collections.sort(numbers);
        System.out.println(numbers);
        System.out.println("Task 2");
        System.out.println("Please write 5 numbers");
        List<Integer> numbers2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            numbers2.add(num);
        }
        System.out.println("print all numbers in reverse sequence");
        Collections.reverse(numbers2);
        System.out.println(numbers2);

        System.out.println("Task 3");
        String str = " well, collection is very easiest topic in java and it is very useful as well";
        String[] words = str.split("[,\\s]+");
        Set<String> wordsSet = new LinkedHashSet<>();
        for (String word : words) {
            if (!word.equals("well")) {
                wordsSet.add(word);
            }
        }
        for (String word : wordsSet) {
            System.out.print(word + " ");
        }
    }
}
