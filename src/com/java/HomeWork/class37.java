package com.java.HomeWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class class37 {
    public static void main(String[] args) {
        Map<String,String> fifa = new HashMap<>();
        fifa.put("Argentina", "Lionel Messi");
        fifa.put("Belgium", "Eden Hazard");
        fifa.put("Brazil", "Thiago Silva");
        fifa.put("Denmark", "Simon Kjaer");
        fifa.put("Portugal", "Cristiano Ronaldo");
        fifa.put("USA", "Chrisian Pulisic");
        fifa.put("Australia", "Mathew Ryan");
        fifa.put("Wales",   "Gareth Bale");


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a captain of team:");
        String captain = scan.nextLine();

        Set<Map.Entry<String, String>> teams = fifa.entrySet();
        for (Map.Entry<String, String> teamCaptains : teams){
            if(captain.equals(teamCaptains.getValue())){
                System.out.println(teamCaptains.getKey());
            }
        }
    }
}
