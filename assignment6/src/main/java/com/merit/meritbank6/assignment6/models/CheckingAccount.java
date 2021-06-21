package com.merit.meritbank6.assignment6.models;

import java.util.Date;

import javax.persistence.Entity;

//Many-to-One with AccountHolders



@Entity
public class CheckingAccount extends BankAccount {
	
	
	static int counter=0; 
	protected static double checkingInterestRate = 0.0001;
	
	public CheckingAccount() {
		super();
	}
	
	public CheckingAccount(double openingBalance) {
		super(openingBalance, checkingInterestRate);
	}
	
	CheckingAccount(double balance, double interestRate){
		super(balance,interestRate);
	}
	
	CheckingAccount(double balance, double interestRate, 
			Date accountOpenedOn) {
		super(balance,interestRate,accountOpenedOn);
	}
	
	CheckingAccount(long accountNumber, double balance, 
			double interestRate, Date accountOpenedOn) {
		super(accountNumber,balance,interestRate,accountOpenedOn);
	}

}
