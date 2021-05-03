package com.meritamerica.assignment2;

import com.meritamerica.assignment2.AccountHolder;


public class MeritAmericaBankApp {
	public static void main(String[] args) {
		CDOffering[] offerings = {
		new CDOffering(1,0.018),
		new CDOffering(2,0.019),
		new CDOffering(3,0.02),
		new CDOffering(5,0.025),
		new CDOffering(10,0.022),
		};
		
				System.out.println("Hello Merit America!");
				
		MeritBank.setCDOfferings(offerings);
		AccountHolder ah1 = new AccountHolder("Jim","John","Johnson","123456789");
		ah1.addCheckingAccount(1000.00);
		ah1.addSavingsAccount(10000.00);
		ah1.addCheckingAccount(5000.00);
		ah1.addSavingsAccount(50000.00);
		ah1.addCheckingAccount(50000.00);
		ah1.addSavingsAccount(500000.00); 
		ah1.addCheckingAccount(5000.00);
		ah1.addSavingsAccount(50000.00);
		//assert(ah1.getNumberOfCheckingAccounts()==3);
		//assert(ah1.getNumberOfSavingsAccounts()==3);
		double CombinedBal = ah1.getCombinedBalance();
		double openingAmount = ah1.getCombinedBalance();
		ah1.addCDAccount(openingAmount);
		
		MeritBank.addAccountHolder(ah1);
		AccountHolder ah2 = new AccountHolder("Tim","Jimmy","Tom","987654321");
		ah2.addCheckingAccount(1000.00);
		ah2.addSavingsAccount(10000.00);
		double openingamount2 = 5000;
		ah2.addCDAccount(openingamount2);
		MeritBank.addAccountHolder(ah2);
		MeritBank.clearCDOfferings();
		//AccountHolder 

	}
}