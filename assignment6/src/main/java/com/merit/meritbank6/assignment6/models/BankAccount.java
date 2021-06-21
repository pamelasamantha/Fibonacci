package com.merit.meritbank6.assignment6.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class BankAccount {
	
	
	@Id
	@GeneratedValue
	static int counter = 1;
	protected long accountNumber;
	protected double balance;
	protected double interestRate;
	
	protected Date openedOn;

	public BankAccount() {
		this.accountNumber = counter++;
		this.openedOn = new Date();
	}
	
	@ManyToOne
	private AccountHolder accountHolder;
	
	BankAccount(double balance, double interestRate){
		this.balance = balance;
		this.interestRate = interestRate;
	}

	BankAccount(double balance, double interestRate, 
					Date accountOpenedOn) {
		this.balance = balance;
		this.interestRate = interestRate;
		this.openedOn = accountOpenedOn;
	}
	
	BankAccount(long accountNumber, double balance, 
			double interestRate, Date accountOpenedOn) {
		this.balance = balance;
		this.interestRate = interestRate;
		this.openedOn = accountOpenedOn;
	}
	
	
	
	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
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

	public Date getOpenedOn() {
		return openedOn;
	}

	public void setOpenedOn(Date openedOn) {
		this.openedOn = openedOn;
	}
	
	
}



