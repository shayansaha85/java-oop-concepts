package com.constructor_getter_setter;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String depositMoney(double deposit) {
        this.balance = this.balance+deposit;
        return "Current balance : "+this.balance;
    }

    public String withdrawMoney(double withdraw) {
        if(this.balance>=withdraw) {
            this.balance = this.balance - withdraw;
            return "Current balance : "+this.balance;
        }
        else {
            return "In sufficient balance";
        }
    }

    public void displayDetails() {
        System.out.println("Customer Name : "+this.customerName);
        System.out.println("Account Number : "+this.accountNumber);
        System.out.println("Phone Number : "+this.phoneNumber);
        System.out.println("Email ID : "+this.email);
        System.out.println("Current Balance : "+this.balance);
    }
}
