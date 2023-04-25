package com.java.class40;

import java.util.HashMap;
import java.util.Map;

public class example1 {
    public static void main(String[] args) {
        //Write a program to find frequency of each character from the String
        String str = "this is my first java collection class and it is easy";
        str = str.toLowerCase();
        Map<Character,Integer> ch = new HashMap<>();

        for (char a : str.toCharArray()){
            if(ch.get(a)==null){
                ch.put(a,1);
            }else {
                ch.put(a,ch.get(a)+1);
            }
        }
        System.out.println(ch);

        int maxFreq = 0;
        char maxChar = ' ';

        for (char c : ch.keySet()) {
            if (ch.get(c) > maxFreq) {
                maxFreq = ch.get(c);
                maxChar = c;
            }
        }

        System.out.println("Character with highest frequency: " + maxFreq);
    }
}
