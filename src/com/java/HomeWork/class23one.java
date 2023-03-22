package com.java.HomeWork;

public class  class23one {
        public static void main(String[] args) {
            // creating objects using different constructors
            IPhone iphone1 = new IPhone();
            IPhone iphone2 = new IPhone("iPhone 12", 128, 799.00);
            IPhone iphone3 = new IPhone("iPhone SE", 64.00);

            // setting static variable values for each object
            iphone1.brand = "Apple Inc.";
            iphone2.brand = "Apple Inc.";
            iphone3.brand = "Apple Inc.";

            // printing all the values
            iphone1.displayPhoneDetails();
            iphone2.displayPhoneDetails();
            iphone3.displayPhoneDetails();

            // calling static method
            IPhone.displayTotalIPhonesSold();
        }

    public static class IPhone {
        // instance variables
        private String model;
        private int storageCapacity;
        private double price;

        // static variables
        static String brand = "Apple";
        private static int totalIPhonesSold = 0;

        // constructors
        public IPhone() {
            this.model = "iPhone 12 Pro Max";
            this.storageCapacity = 256;
            this.price = 1099.00;
            totalIPhonesSold++;
        }

        public IPhone(String model, int storageCapacity, double price) {
            this.model = model;
            this.storageCapacity = storageCapacity;
            this.price = price;
            totalIPhonesSold++;
        }

        public IPhone(String model, double price) {
            this.model = model;
            this.price = price;
            this.storageCapacity = 64;
            totalIPhonesSold++;
        }

        // instance methods
        public void setModel(String model) {
            this.model = model;
        }

        public void setStorageCapacity(int storageCapacity) {
            this.storageCapacity = storageCapacity;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void displayPhoneDetails() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + this.model);
            System.out.println("Storage Capacity: " + this.storageCapacity + "GB");
            System.out.println("Price: $" + this.price);
        }

        // static method
        public static void displayTotalIPhonesSold() {
            System.out.println("Total iPhones sold: " + totalIPhonesSold);
        }
    }
}

