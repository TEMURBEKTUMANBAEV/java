package com.java.HomeWork;

     class Person {
        private String name;
        private int age;
        private String occupation;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getOccupation() {
            return occupation;
        }

        public void setOccupation(String occupation) {
            this.occupation = occupation;
        }
    }

    public class class29one {
        public static void main(String[] args) {
            Person person = new Person();

            // Using setters to set the values of variables
            person.setName("Tumanbaev Temurbek");
            person.setAge(19);
            person.setOccupation("Software Developer Engineer in Test (SDET)");

            // Using getters to get the values of variables
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Occupation: " + person.getOccupation());
        }
    }


