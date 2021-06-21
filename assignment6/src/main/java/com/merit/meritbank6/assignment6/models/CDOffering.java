package com.merit.meritbank6.assignment6.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import com.fasterxml.jackson.annotation.JsonManagedReference;


//One-to-Many with CDAccounts

@Entity //for each model class
public class CDOffering {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cdOffering_Id")
	private int cdOffering_Id;
	
	@NotNull(message = "term is required")
	@Positive
	@Min(value = 1)
	private int cdOffering_term;
	
	@NotNull(message = "interest rate is required")
	@Positive
	@Max(value = 1)
	private double cdOffering_interestRate;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	//@JoinColumn(name= "cdOffering_Id", referencedColumnName = "cdOffering_Id")
	private List<CDAccount> cdAccountList = new ArrayList<CDAccount>();
	
	
	public List<CDAccount> getCdAccountList() {
		return cdAccountList;
	}
	

	
	public void setCdAccountList(List<CDAccount> cdAccountList) {
		this.cdAccountList = cdAccountList;
	}

	public CDOffering() {
		
	}
	
	public int getCdOffering_Id() {
		return cdOffering_Id;
	}
	public void setCdOffering_Id(int cdOffering_Id) {
		this.cdOffering_Id = cdOffering_Id;
	}
	public int getCdOffering_term() {
		return cdOffering_term;
	}
	public void setCdOffering_term(int cdOffering_term) {
		this.cdOffering_term = cdOffering_term;
	}
	public double getCdOffering_interestRate() {
		return cdOffering_interestRate;
	}
	public void setCdOffering_interestRate(double cdOffering_interestRate) {
		this.cdOffering_interestRate = cdOffering_interestRate;
	}

}
