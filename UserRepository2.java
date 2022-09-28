package com.practice.webservices.restfulwebservices.test5;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository2 extends JpaRepository<User2 , Integer>  {

	
}

