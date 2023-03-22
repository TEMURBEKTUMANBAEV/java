package com.java.HomeWork;
    public class  class24one {
        public static void main(String[] args) {
            Bank account1 = new Bank("123456789", "Tumanbaev Temurbek", 19000);
            account1.deposit(1000);
            Bank.setInterestRate(0.06);
            account1.getAccountInfo();
        }
    public static class Bank {
        private static double interestRate = 0.05;
        private String accountNumber;
        private String accountHolderName;
        private double balance;
        public Bank(String accountNumber, String accountHolderName, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = balance;
        }
        public static void setInterestRate(double rate) {
            interestRate = rate;
        }
        public void deposit(double amount) {
            balance += amount;
        }
        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("Insufficient balance!");
            }
        }
        public void getAccountInfo() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Balance: " + balance);
            System.out.println("Interest Rate: " + interestRate);
        }
    }
}


