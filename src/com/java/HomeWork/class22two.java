package com.java.HomeWork;

    class Example {
        String name;
        int age;
        double height;

        void printInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Height: " + height);
        }

        void celebrateBirthday() {
            age++;
            System.out.println("Happy birthday! You are now " + age + " years old.");
        }
    }

    public class class22two {
        public static void main(String[] args) {
            Example person1 = new Example();
            Example person2 = new Example();

            person1.name = "Alice";
            person1.age = 25;
            person1.height = 1.65;

            person2.name = "Bob";
            person2.age = 35;
            person2.height = 1.8;

            person1.printInfo();
            person2.celebrateBirthday();
            person2.printInfo();
        }
    }

