package com.java.HomeWork;
    class Parent {
        public void printMessage() {
            System.out.println("This is a message from the Parent class");
        }
    }

    class Child extends Parent {
        @Override
        public void printMessage() {
            System.out.println("This is a message from the Child class");
        }
    }

    public class class27two {
        public static void main(String[] args) {
            Child childObj = new Child();
            childObj.printMessage();
        }
    }

