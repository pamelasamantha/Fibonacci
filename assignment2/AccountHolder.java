package com.meritamerica.assignment2;

import java.util.Arrays;

import com.meritamerica.assignment2.CheckingAccount;
import com.meritamerica.assignment2.SavingsAccount;

public class AccountHolder {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn; 
	double openingBalance;
	CheckingAccount[] checkingAccounts = new CheckingAccount[0];
	SavingsAccount[] savingsAccounts = new SavingsAccount[0];
	CDAccount[] cdAccounts = new CDAccount[0];
	int numberOfCheckingAccounts = 0;
	int numberOfSavingsAccounts = 0;
	double savingsBalance;
	double offering;
	CDAccount[] CDaccount = new CDAccount[0];
	private double checkingAccountOpeningBalance;
	private double savingsAccountOpeningBalance;
	private SavingsAccount savingsAccount;


	public AccountHolder(String firstName, String middleName, String lastName,
			String ssn) {

		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
	}	


	public String getFirstName() {
		return firstName; 
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSSN() {
		return ssn;
	}

	public void setSSN(String ssn) {
		this.ssn = ssn;
	}

	public CheckingAccount addCheckingAccount(double openingBalance) {
		if (openingBalance < 0.0) {
			return null;
		}
		if (this.getCheckingBalance() + this.getSavingsBalance() >= 250000.0) {
			return null;
		}
		CheckingAccount ca = new CheckingAccount(openingBalance);
		return addCheckingAccount(ca);
	}

	public CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {

		if (this.getCheckingBalance() + this.getSavingsBalance() + checkingAccount.getBalance() >= 250000.0) {
			return null;
		}
		CheckingAccount[] temp = Arrays.copyOf(checkingAccounts, checkingAccounts.length + 1);
		temp[temp.length -1] = checkingAccount;
		checkingAccounts = temp;
		return checkingAccount;


	}
	public CDAccount addCDAccount(double openingBalance) {
		if (openingBalance < 0.0) {
			return null;
		}
		if (this.getSavingsBalance() + this.getCheckingBalance() >= 250000.0) {
			return null;
		}
		CDOffering cdOffering = MeritBank.getBestCDOffering(20000);
		CDAccount cd = new CDAccount(cdOffering, openingBalance);
		return addCDAccount(cd);
	}

	public CDAccount addCDAccount(CDAccount cdAccount) {
		if (this.getSavingsBalance() + this.getCheckingBalance() >= 250000.0) {
			return null;
		}
		CDAccount[] temp = Arrays.copyOf(cdAccounts, cdAccounts.length + 1);
		temp[temp.length -1] = cdAccount;
		cdAccounts = temp;
		return cdAccount;

	}

	public SavingsAccount addSavingsAccount(double openingBalance) {
		if (openingBalance < 0.0) {
			return null;
		}
		if (this.getSavingsBalance() + this.getCheckingBalance() >= 250000.0) {
			return null;
		}
		SavingsAccount ca = new SavingsAccount(openingBalance);
		return addSavingsAccount(ca);
	}

	public SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		if (this.getSavingsBalance() + this.getCheckingBalance() + savingsAccount.getBalance() >= 250000.0) {
			return null;
		}

		SavingsAccount[] temp = Arrays.copyOf(savingsAccounts, savingsAccounts.length + 1);
		temp[temp.length -1] = savingsAccount;
		savingsAccounts = temp;
		return savingsAccount;
	}

	public int getNumberOfCheckingAccounts() {
		return checkingAccounts.length;
	}
	public int getNumberOfSavingsAccounts() {
		return savingsAccounts.length;
	}


	public double getCheckingBalance() {
		double CombinedBalance = 0.0;
		for (int i = 0; i < checkingAccounts.length; i++) {
			CombinedBalance += checkingAccounts[i].getBalance();

		}
		return CombinedBalance;
	}

	public double getSavingsBalance() {
		//if(savingsAccounts.length != 0) {
			
			double CombinedBalance = 0.0;
			for (int i = 0; i < savingsAccounts.length; i++) {
				CombinedBalance  += savingsAccounts[i].getBalance();

			}
			return CombinedBalance;
		
	}
	public double addSavingsAccount1(double openingBalance) {
		return openingBalance;

	}
	public double getCombinedBalance() {
		return getSavingsBalance() + getCheckingBalance() + getCDBalance() ;

	}
	public double SavingsAccount = AccountHolder( openingBalance); 


	public double getCheckingAccountOpeningBalance() {
		return checkingAccountOpeningBalance;
	}

	private double AccountHolder(double openingBalance2) {
		
		return 0;
	}

	public void setCheckingAccountOpeningBalance(double checkingAccountOpeningBalabce) {
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
	}
	public double getSavingsAccountOpeningBalance() {
		return savingsAccountOpeningBalance;
	}
	public void setSavingsAccountOpeningBalance(double savingsAccountOpeningBalance) {
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
	}
	
	CheckingAccount[] getCheckingAccounts() {
		return checkingAccounts;

	}
	SavingsAccount[] getSavingsAccounts() {
		return savingsAccounts;
	}

	CDAccount[] getCDAccounts() {
		return cdAccounts;
	}
	double getCDBalance() {
		double CombinedBalance = 0.0;
		for (int i = 0; i < cdAccounts.length; i++) {
			CombinedBalance  += cdAccounts[i].getBalance();

		}
		return CombinedBalance;
	}

}