package com.merit.meritbank6.assignment6.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.merit.meritbank6.assignment6.models.CheckingAccount;

public interface CheckingAccountRepository extends JpaRepository<CheckingAccount, Integer> {

}
