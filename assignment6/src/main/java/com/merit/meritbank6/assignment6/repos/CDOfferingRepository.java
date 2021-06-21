package com.merit.meritbank6.assignment6.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.merit.meritbank6.assignment6.models.CDOffering;

@Repository
public interface CDOfferingRepository extends JpaRepository<CDOffering, Integer>{

}
