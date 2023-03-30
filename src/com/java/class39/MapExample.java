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
        map.put("Azat", 96);

        System.out.println(map);
        System.out.println(map.get("Temurbek"));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("Azat"));
        System.out.println(map.containsValue(69));
    }
}
