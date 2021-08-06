package meritbank.capstone.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity 
@Table(name = "account_type")
public class AccountType {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
	
	@Column(name = "amount")
	private String amount;
	
	@Column(name = "account")
	private String account;
	
	
	public AccountType() {
		
	}
	
	
	public AccountType(String amount, String account) {
		super();
		this.amount = amount;
		this.account = account;
	}
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getamount() {
		return amount;
	}

	public void setamount(String amount) {
		this.amount = amount;
	}

	public String getaccount() {
		return account;
	}

	public void setaccount(String account) {
		this.account = account;
	}

	
}
