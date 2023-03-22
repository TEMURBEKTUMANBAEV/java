package com.java.HomeWork;

public class class23two {
    public static void main(String[] args) {
        System.out.println("Default values:");
        System.out.println("Name: " + MyStaticClass.name);
        System.out.println("Age: " + MyStaticClass.age);
        System.out.println("Height: " + MyStaticClass.height);

        // Create object of MyStaticClass
        MyStaticClass obj = new MyStaticClass();

        obj.name = "Elkhan";
        obj.age = 19;
        obj.height = 1.85;


        System.out.println("\nUpdated values:");
        System.out.println("Name: " + MyStaticClass.name);
        System.out.println("Age: " + MyStaticClass.age);
        System.out.println("Height: " + MyStaticClass.height);
    }

    public static class MyStaticClass {
        public static String name = "Temurbek";
        public static int age = 19;
        public static double height = 1.95;
    }
}

