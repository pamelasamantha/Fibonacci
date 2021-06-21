package com.merit.meritbank6.assignment6.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.merit.meritbank6.assignment6.models.AccountHolder;


@Repository
public interface AccountHolderRepository extends JpaRepository<AccountHolder, Integer> {
	
	//List<AccountHolder>findByName(String firstName);

}
