package com.meritamerica.assignment2;

	

public class CDOffering {
	
		
	int year;
	double interestRate;
	
	public CDOffering(int term, double interestRate) {
		this.year = term;
		this.interestRate = interestRate;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}



	
	public int getTerm() {
		return year;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
}