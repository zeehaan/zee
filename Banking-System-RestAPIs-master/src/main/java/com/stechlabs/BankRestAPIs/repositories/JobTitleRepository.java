package com.stechlabs.BankRestAPIs.repositories;

import com.stechlabs.BankRestAPIs.models.Job_Title;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobTitleRepository extends JpaRepository<Job_Title,Integer> {
}
