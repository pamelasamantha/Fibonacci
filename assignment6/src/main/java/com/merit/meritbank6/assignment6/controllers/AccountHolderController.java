package com.merit.meritbank6.assignment6.controllers;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.merit.meritbank6.assignment6.models.AccountHolder;
import com.merit.meritbank6.assignment6.models.CDAccount;
import com.merit.meritbank6.assignment6.models.CheckingAccount;
import com.merit.meritbank6.assignment6.models.SavingsAccount;
import com.merit.meritbank6.assignment6.repos.AccountHolderRepository;


/*One-to-One with AccountHoldersContactDetails
 * One-to-Many with CheckingAccount
 * One-to-Many with SavingsAccount
 * One-to-Many with CDAccounts
 */

@RestController
public class AccountHolderController {
	
	private List<AccountHolder> accounHoldersList = new ArrayList<AccountHolder>();
	
	@Autowired
	AccountHolderRepository accountholderRepo;
	
	
	@PostMapping("/AccountHolders")
	@ResponseStatus(HttpStatus.CREATED)
	public AccountHolder addAccountHolder(@RequestBody @Valid AccountHolder accountHolder) {
		
		accounHoldersList.add(accountHolder);
		return accountHolder;
	}
	
	@GetMapping("/AccountHolders")
	@ResponseStatus(HttpStatus.OK)
	public List<AccountHolder> getAccountHolders() {
		
		return accounHoldersList;
	}
	
	@GetMapping("/AccountHolders/{id}")
	@ResponseStatus(HttpStatus.OK)
	public AccountHolder getAccountHolder(@PathVariable int id) {
		
		return accounHoldersList.get(id-1);
	}
	
	
	@PostMapping("/AccountHolders/{id}/CheckingAccounts")
	public CheckingAccount addCheckingAccount(@PathVariable int id, @RequestBody CheckingAccount ca) {
		
		accounHoldersList.get(id-1).getCheckingAccountsList().add(ca);
		
		return ca;
	}
	
	
	@GetMapping("/AccountHolders/{id}/CheckingAccounts")
	public List<CheckingAccount> getCheckingAccount(@PathVariable int id) {
		
		//accounHoldersList.get(id-1).getCheckingAccountsList();
		
		return accounHoldersList.get(id-1).getCheckingAccountsList();
	}
	
	
	@PostMapping("/AccountHolders/{id}/SavingsAccounts")
	public SavingsAccount addSavingsAccount(@PathVariable int id, @RequestBody SavingsAccount sa) {
		
		accounHoldersList.get(id-1).getSavingsAccountsList().add(sa);
		
		return sa;
	}
	
	
	@GetMapping("/AccountHolders/{id}/SavingsAccount")
	public List<SavingsAccount> getSavingsAccount(@PathVariable int id) {
		
		return accounHoldersList.get(id-1).getSavingsAccountsList();
	}
	
	@PostMapping("/AccountHolders/{id}/CDAccounts")
	public CDAccount addCDAccount(@PathVariable int id, @RequestBody CDAccount cdAccount) {
		
		
		accounHoldersList.get(id-1).getCdAccountsList().add(cdAccount);
		
		return cdAccount;
	}
	
	
	@GetMapping("/AccountHolders/{id}/CDAccounts")
	public List<CDAccount> getCDAccount(@PathVariable int id) {
		
		return accounHoldersList.get(id-1).getCdAccountsList();
	}
	
	
	public List<AccountHolder> getAccounHoldersList() {
		return accounHoldersList;
	}

	public void setAccounHoldersList(List<AccountHolder> accounHoldersList) {
		this.accounHoldersList = accounHoldersList;
	}
}
	
