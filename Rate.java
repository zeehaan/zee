package com.practice.webservices.restfulwebservices.test5;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Rating2")
public class Rate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ratingID;

	@Column(name = "rate")
	private int rate;
	@Column(name = "count")
	private int count;

}
