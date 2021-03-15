package com.course1;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("No Account Number", 999999.99,
                "Default", "Default",
                "Default");
        System.out.println("Default Constructor");
    }

    public BankAccount(String accountNumber, double balance,
                       String customerName, String email,
                       String phoneNumber) {
        System.out.println("Constructor with Data");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double value) {
        this.balance += value;
        System.out.println("Su deposito de $" + value + " se realizó con éxito");
        System.out.println("Balance: " + this.balance);
    }

    public void withdrawFunds(double value) {
        if(this.balance - value <= 0) {
            System.out.println("Insufficient Funds.");
        } else {
            this.balance -= value;
            System.out.println("Su retiro de $" + value + " dólares " + "se realizó con éxito.");
            System.out.println("Balance: " + this.balance);
        }
    }
}
