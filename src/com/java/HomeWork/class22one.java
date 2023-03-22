package com.java.HomeWork;
        abstract class phone {
            String brand;
            String model;
            int storage;
            int price;

            void makeCall(String number) {
                System.out.println("Calling " + number + brand + model);
            }

            void sendMessage(String number, String message) {
                System.out.println("Sending message to " + number + ": " + message);
            }

            public abstract void repair();
        }


public class class22one {
    public static void main(String[] args) {

                phone phone1 = new phone() {
                    @Override
                    public void repair() {

                    }
                };
                phone phone2 = new phone() {
                    @Override
                    public void repair() {

                    }
                };
                phone phone3 = new phone() {
                    @Override
                    public void repair() {

                    }
                };


                phone1.brand = "Samsung ";
                phone1.model = "Galaxy S20";
                phone1.storage = 128;
                phone1.price = 799;


                phone2.brand = "Apple";
                phone2.model = "iPhone 12";
                phone2.storage = 256;
                phone2.price = 1099;


                phone3.brand = "OnePlus";
                phone3.model = "9 Pro";
                phone3.storage = 256;
                phone3.price = 999;

                phone1.makeCall("555-1234 ");
                phone2.sendMessage("555-5678 ", "Hello, how are you?");
                phone3.makeCall("555-9012 ");
            }
        }

