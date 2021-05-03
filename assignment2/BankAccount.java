package com.meritamerica.assignment2;


public class BankAccount {
	
	private double balance;
	private double interestRate;
	private double accountNumber;
	
	public BankAccount() {
		
	}
	
	BankAccount(double balance, double interestRate){
		this.balance = balance;
		this.interestRate = interestRate; 
	}
	
	BankAccount(long accountNumber, double balance, double interestRate){
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate; 
	}

	
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}

	boolean withdraw(double amount) {
		return false;
	}
	
	boolean deposit (double amount) {
		return false;
	}
	
	double futureValue(int years) {
		return 0.0;
	}

}