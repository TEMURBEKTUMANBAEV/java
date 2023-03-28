package com.java.class38;

import java.util.ArrayList;

public class Fruits {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("mango");

        if (fruits.contains("banana")) {
            fruits.remove("mango");
        }
        System.out.println(fruits);
    }
}
