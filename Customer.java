package com.bank;

public class Customer {
	String name;
	BankAccount account;
	
	Customer(String name, BankAccount account){
		this.name = name;
		this.account = account;
	}
	void displayCustomer() {
		System.out.println("Customer Name:" + name);
		System.out.println("Account Number:" + account.accountNumber);
	}

}
