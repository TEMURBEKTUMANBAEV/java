package com.java.HomeWork;


    // Food.java
  class Food {
        private String name;

        public Food() {
            System.out.println("Creating a new food item...");
        }

        public Food(String name) {
            this.name = name;
            System.out.println("Creating a new food item named " + name);
        }
    }

    // VegFood.java
  class VegFood extends Food {
        private boolean isVegan;

        public VegFood() {
            super();
            System.out.println("Creating a new vegetarian food item...");
        }

        public VegFood(String name, boolean isVegan) {
            super(name);
            this.isVegan = isVegan;
            System.out.println("Creating a new vegetarian food item named " + name + " which is " + (isVegan ? "" : "not ") + "vegan");
        }
    }

    // Salad.java
    class Salad extends VegFood {
        private boolean hasDressing;

        public Salad() {
            super();
            this.hasDressing = true;
            System.out.println("Creating a new salad...");
        }

        public Salad(String name, boolean isVegan, boolean hasDressing) {
            super(name, isVegan);
            this.hasDressing = hasDressing;
            System.out.println("Creating a new salad named " + name + " which is " + (isVegan ? "" : "not ") + "vegan and " + (hasDressing ? "" : "does not ") + "have dressing");
        }
    }

    // MainClass.java
    public class class26one {
        public static void main(String[] args) {
            Salad salad = new Salad("Greek Salad", true, true);
        }
    }

