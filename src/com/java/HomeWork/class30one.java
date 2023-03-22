package com.java.HomeWork;

    abstract class Car {
        public static void staticMethod() {
            System.out.println("This is a static method");
        }

        public void nonAbstractMethod() {
            System.out.println("This is a non-abstract method");
        }

        public abstract void abstractMethod();
    }

    class SportsCar extends Car {
        @Override
        public void abstractMethod() {
            System.out.println("Abstract method overridden in SportsCar class");
        }
    }

    public class class30one {
        public static void main(String[] args) {
            Car myCar = new SportsCar();
            myCar.staticMethod();
            myCar.nonAbstractMethod();
            myCar.abstractMethod();
        }
    }


