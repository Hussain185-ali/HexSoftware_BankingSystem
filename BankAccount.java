package com.bank;

public class BankAccount {
	
    int accountNumber;
    double balance;
    BankAccount(int accountNumber, double balance){
    	this.accountNumber = accountNumber;
    	this.balance = balance;
    	
    }
    void deposit(double amount) {
    	balance = balance + amount;
    	System.out.println("Amount Deposited:" + amount);
    }
    void withdraw(double amount) {
    	if(amount > balance) {
    		System.out.println("Insufficient Balance!");
    		
    	}else {
    		balance = balance - amount;
    		System.out.println("Amount Withdrawn:" + amount);
    		}
    }
    void checkBalance() {
    	System.out.println("Current Balance:" + balance);
    	
    }


}
