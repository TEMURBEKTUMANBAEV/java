package com.java.class39;

import java.util.Map;
import java.util.HashMap;
public class magazineJavaclass {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("Temurbek",5);
        map.put("Madina",4);
        map.put("Chirag",5);
        map.put("Mustafa",4);
        map.put("Maxim",5);
        map.put("Emily",4);
        map.put("Diana",5);
        map.put("Temirlan",4);
        map.put("Azat",5);
        map.put("Milana",4);

        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println("{"+entry.getKey()+"=" +entry.getValue()+"}");
        }
    }
}
