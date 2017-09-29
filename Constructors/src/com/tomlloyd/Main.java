package com.tomlloyd;

public class Main {

    public static void main(String[] args) {

//        BankAccount myNewAccount = new BankAccount();
//
//
////        myNewAccount.setAccountNumber(1234);
//        System.out.println("Account number is " + myNewAccount.getAccountNumber());
//
////        myNewAccount.setBalance(1000);
//        System.out.println("Initial balance is " + myNewAccount.getBalance());
//
////        myNewAccount.setCustomerName("Tom Lloyd");
//        System.out.println("The customer name is " + myNewAccount.getCustomerName());
//
////        myNewAccount.setEmail("test@test.com");
//        System.out.println("Email is " + myNewAccount.getEmail());
//
////        myNewAccount.setPhoneNumber(12345678);
//        System.out.println("Phone number is " + myNewAccount.getPhoneNumber());
//
//        System.out.println();
//
//        myNewAccount.withdrawFunds(450);
//        myNewAccount.depositFunds(50);
//        myNewAccount.withdrawFunds(700);
//        myNewAccount.withdrawFunds(600);
//
//        BankAccount timsAccount = new BankAccount("Tim", "email", 12345);
//        System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getCustomerName());

        VipCustomer mrImportant = new VipCustomer("Tom", 100, "email.com");
        System.out.println("Name is " + mrImportant.getName());
        System.out.println("Credit limit is " + mrImportant.getCreditLimit());
        System.out.println("Email is " + mrImportant.getEmailAddress());
    }
}
