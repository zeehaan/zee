package com.practice.webservices.restfulwebservices.test5;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class User2 {
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id;
	String title;
	String price;
	@Column(length =800)	
	String description;
	@Column(length = 500)
	String category;
	@Column(length = 500)
	String image;	
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="rating")
	private Rate rating; 		
	
}