package com.meritamerica.assignment2;

public class CheckingAccount extends BankAccount  {
	 private double balance;
	 private double interestRate;
	

	   public CheckingAccount() {
		// TODO Auto-generated constructor stub
	}
	    
	    public CheckingAccount(double openingBalance) {
	        this.balance = openingBalance;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void setBalance(double balance) {
			this.balance = balance;
		}

		public void setInterestRate(double interestRate) {
			this.interestRate = interestRate;
		}
}

