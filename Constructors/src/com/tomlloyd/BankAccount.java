package com.tomlloyd;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount() {
        this(9999, 0, "No name", "no@email.com", 9999);
        System.out.println("Empty constructor");
    }

    public BankAccount(int number, double balance, String customerName, String email, int phoneNumber) {
        this.accountNumber = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Called constructor with parameters");

    }

    public BankAccount(String customerName, String email, int phoneNumber) {
        this(999999,100, customerName, email, phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //    public void setAccountNumber(int accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//
//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setPhoneNumber(int phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }


    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }


    public void depositFunds(double amount) {
        this.balance += amount;
        System.out.println("Deposited the amount " + amount + ". New balance is " + this.balance);
    }

    public void withdrawFunds(double amount) {
        if(amount > this.balance) {
            System.out.println("Insufficient funds. Attempted to withdraw " + amount + " but balance is " + this.balance);
        } else {
            this.balance -= amount;
            System.out.println("Withdrew the amount " + amount + ". New balance is " + this.balance);
        }
    }
}
