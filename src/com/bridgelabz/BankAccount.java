package com.bridgelabz;

import java.util.Scanner;

public class BankAccount {

    private String name;
    private String accountNumber;
    private String phoneNumber;
    private long accountBalance;

    public BankAccount(String name, String accountNumber, String phoneNumber, long accountBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.phoneNumber = phoneNumber;
        this.accountBalance = accountBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void deposite(){
        Scanner scanner = new Scanner(System.in);
        long amount;
        System.out.println("Enter Amount you want to Deposit :");
        amount=scanner.nextLong();
        accountBalance = accountBalance + amount;
    }
    public void withdrawal(){
        Scanner scanner = new Scanner(System.in);
        long amount;
        System.out.println("Enter amount you want to withdraw :");
        amount=scanner.nextLong();
        if(accountBalance>=amount) {
            accountBalance = accountBalance - amount;
            System.out.println("Balance after withdrawal :" + accountBalance);
        }else{
            System.out.println("Your balance is less :"+amount+"Transaction failed");

        }
    }


}