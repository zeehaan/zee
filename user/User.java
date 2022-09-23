package com.practice.webservices.restfulwebservices.user;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Size(min=2,message="Name should have atleast2 characters")
	private String name;
	
	@Past
	private Date birthdate;

	public  User(Integer id, String name, Date birthdate) {		
		this.id = id;
		this.birthdate = birthdate;
		this.name = name;
	}
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="user_id")
	private  Set<Post> posts=new HashSet<Post>();
	
	public User() {
		
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", name=" + name + ", birthdate=" + birthdate + "]";
	}
	public Integer getId() {
		return id;
	}  
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public Set<Post> getPosts() {
		return posts;
	}
	

}
