package com.bridgelabz;

public class Bank {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Swapnil Patil","12345678901234","9967891679",8000);
        System.out.println("Account Holder name :"+bankAccount.getName());
        System.out.println("Account Number :"+bankAccount.getAccountNumber());
        System.out.println("Mobile Number :"+bankAccount.getPhoneNumber());
        System.out.println("Account Balance :"+bankAccount.getAccountBalance());
        bankAccount.deposite();
        bankAccount.withdrawal();

    }
}



/*
Account Holder name :Swapnil Patil
Account Number :12345678901234
Mobile Number :9967891679
Account Balance :8000
Enter Amount you want to Deposit :
500
Enter amount you want to withdraw
1000
Balance after withdrawal :7500

 */