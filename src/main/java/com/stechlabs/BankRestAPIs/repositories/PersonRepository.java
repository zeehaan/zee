package com.stechlabs.BankRestAPIs.repositories;

import com.stechlabs.BankRestAPIs.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {

}
