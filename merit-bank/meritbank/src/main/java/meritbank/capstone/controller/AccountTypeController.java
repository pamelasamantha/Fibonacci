package meritbank.capstone.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import meritbank.capstone.exception.ResourceNotFoundException;
import meritbank.capstone.model.AccountType;
import meritbank.capstone.repository.AccountTypeRepository;


@CrossOrigin(origins = "http://localhost:3004")
@RestController
@RequestMapping("/api/v1/")
public class AccountTypeController {
	
	
	@Autowired
	private AccountTypeRepository accountTypeRepository;
	
	
	//get all accounts
	@GetMapping("/accountType")
	public List<AccountType> getAllTypes() {
		return accountTypeRepository.findAll();
	}
	
	//create account type rest api
	@PostMapping("/accountType")
	public AccountType createAccountType(@RequestBody AccountType accountType) {
		return accountTypeRepository.save(accountType);
	}
	
	//get account by id rest api
	@GetMapping("/accountType/{id}")
	public ResponseEntity<AccountType> getAccountTypeById(@PathVariable Long id) {
		AccountType accountType = accountTypeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Account holder does not exist with id:" + id));
				return ResponseEntity.ok(accountType);
	}
	
	//update account rest api 
	@PutMapping("/accountType/{id}")
	public ResponseEntity<AccountType> updateAccountType(@PathVariable Long id, @RequestBody AccountType accountTypeDetails) {
		AccountType accountType = accountTypeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Accountholder does not exist with id:" + id));
		
		accountType.setamount(accountTypeDetails.getamount());
		accountType.setaccount(accountTypeDetails.getaccount());
		//accountholder.setLastName(accountholderDetails.getLastName());
		
		AccountType updatedAccountType = accountTypeRepository.save(accountType);
		return ResponseEntity.ok(updatedAccountType);
		
	}
	
	//delete account
	@DeleteMapping("/accountType/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteAccountType(@PathVariable Long id) {
		AccountType accountType = accountTypeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Accountholder does not exist with id: " + id));
		
		accountTypeRepository.delete(accountType);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

}
