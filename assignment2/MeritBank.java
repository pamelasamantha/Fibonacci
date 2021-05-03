package com.meritamerica.assignment2;


import java.util.Arrays;
import java.util.Random;
import java.util.spi.CalendarDataProvider;

	
public class MeritBank {

	private static CDOffering[] cdOfferings = {};

	static void addAccountHolder(AccountHolder accountHolder) {
		if(accountHolder != null) {
			AccountHolder[] temp = Arrays.copyOf(accountHolders, accountHolders.length + 1);
			temp[temp.length -1] = accountHolder;
			accountHolders = temp;
		}
	}

	static AccountHolder[] accountHolders = new AccountHolder[0];

	static AccountHolder[] getAccountholder() {
		return getAccountholder();
	}
	static CDOffering[] getCDOfferings() {
		return cdOfferings;
	}
	static CDOffering getBestCDOffering(double depositAmount) {
		double bestIR = -1;
		CDOffering bestCDO = null;
		for (int i= 0; i < cdOfferings.length; i++ ) {
			CDOffering cdo = cdOfferings[i];
			double interestRate =cdo.getInterestRate();
			if (interestRate > bestIR) {
				bestIR = interestRate;
				bestCDO =cdo;
			}
		}
		return bestCDO;
	}
	static CDOffering getSecondBestCDOffering(double depositAmount) {
		double bestIR = -1;
		CDOffering secondCDO = null;
		CDOffering bestCDO = null;
		for (int i= 0; i < cdOfferings.length; i++ ) {
			CDOffering cdo = cdOfferings[i];
			double interestRate =cdo.getInterestRate();
			if (interestRate > bestIR) {
				bestIR = interestRate;
				secondCDO = bestCDO;
				bestCDO = cdo;
			}
		}
		return secondCDO;
	}
	static void clearCDOfferings() {
		cdOfferings = null;
	}
	static void setCDOfferings(CDOffering[] offerings) {
		cdOfferings = offerings;
	}


	static long getNextAccountNumber() {
		accountNumber++;
		return accountNumber;
	}
	static long accountNumber;

	static double totalBalances() {
		double CombinedBalance = 0;
		for(int i = 0; i < accountHolders.length; i++) {
			AccountHolder accHolder = accountHolders[i];
			CombinedBalance = CombinedBalance + accHolder.getCombinedBalance();	

		}
		return CombinedBalance;
	}

	static double futureValue(double presentValue, double interestRate, int term) {
		double factor = 1+interestRate;
		return Math.pow(factor, term) * presentValue;

	}
	static AccountHolder[] getAccountHolders() {
		System.out.println("account holder array length :"+accountHolders[0].getSavingsBalance());
		return accountHolders;
	}


}
