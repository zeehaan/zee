package com.stechlabs.BankRestAPIs.repositories;

import com.stechlabs.BankRestAPIs.models.Email_Tracking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailTrackingRepository extends JpaRepository<Email_Tracking,Integer> {
}
