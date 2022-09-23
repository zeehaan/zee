package com.practice.webservices.restfulwebservices.test5;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepository2 extends JpaRepository<Rate,Integer> {

}
