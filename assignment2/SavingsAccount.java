package com.meritamerica.assignment2;

public class SavingsAccount extends BankAccount {
	
	private double balance;
	 private double interestRate;
	

	   public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}
	    
	    public SavingsAccount(double openingBalance) {
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