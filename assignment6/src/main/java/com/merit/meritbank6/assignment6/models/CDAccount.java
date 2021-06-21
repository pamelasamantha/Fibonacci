package com.merit.meritbank6.assignment6.models;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



/*Many-to-One with AccountHolders
 * Many-to-One with CDOfferings
 */

@Entity
public class CDAccount extends BankAccount {
	
	
	private int term;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	//@JoinColumn
	CDOffering cdOffering;


	
	public CDAccount() {
			super();
			this.cdOffering = getOfferingFromCDAccount();
		}
	
		CDAccount(long accountNumber,double balance,
				CDOffering offering,Date accountOpenedOn){
			
			super(accountNumber,balance,offering.getCdOffering_interestRate(),accountOpenedOn);
			
		}
	
		public double getInterestRate() {
			return interestRate;
		}
	
		public void setInterestRate(double interestRate) {
			this.interestRate = interestRate;
		}
		
		public int getTerm() {
			return term;
		}

		public void setTerm(int term) {
			this.term = term;
		}
		
		public CDOffering getCdOffering() {
			return cdOffering;
		}
	
		public void setCdOffering(CDOffering cdOffering) {
			this.cdOffering = cdOffering;
		}
	
	
		private CDOffering getOfferingFromCDAccount() {
		CDOffering cdo = new CDOffering();
		cdo.setCdOffering_interestRate(this.interestRate);
		cdo.setCdOffering_interestRate(this.term);
		return cdo;
		}
	
		
}