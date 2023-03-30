package com.java.class39;

import java.util.Map;
import java.util.HashMap;


public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Temurbek", 46);
        map.put("Tair", 58);
        map.put("Azat", 69);
        map.put("Chirag", 18);
        map.put("Madina", 230);
        map.put("Maxim", 24);

        System.out.println(map);
        System.out.println(map.get("Temurbek"));
        System.out.println(map.size());
    }
}
