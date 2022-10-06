package com.stechlabs.BankRestAPIs.repositories;

import com.stechlabs.BankRestAPIs.models.Bank_Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankBranchRepository extends JpaRepository<Bank_Branch,Integer> {

    @Query(value = "SElECT * FROM bank_branch br",nativeQuery = true)
    List<Bank_Branch> getBranches();
}
