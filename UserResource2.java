package com.practice.webservices.restfulwebservices.test5;
import java.util.Iterator;

import java.util.List;
import java.util.Optional;

import javax.management.AttributeNotFoundException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserResource2 {
	
	private static final ResponseEntity<Object> ResponseEntity = null;
	@Autowired
	private UserRepository2 userRepository2;	
	
	@Autowired
	private RatingRepository2 ratingRepository2;
	

	@GetMapping(path = "/users2")
	public List<User2> retriveAllUsers2() {
		return userRepository2.findAll();
	}
	
	@GetMapping("/users2/{id}")
	public Optional<User2> retriveUser(@PathVariable int id) {
			Optional<User2> user2=userRepository2.findById(id);
			if(user2.isEmpty()) {
				throw new UserNotFoundException("User of "+id+" id is Not Found in the records");
			}
				return user2;
	}
	
	@DeleteMapping("/users2/{id}")
	public List<User2> DeleteUser(@Valid @PathVariable int id) {
		if((userRepository2.findById(id).isEmpty())) {
			throw new UserNotFoundException("Can not Delete User of ID "+id+" as he is not found in the records");
		} 				
            userRepository2.deleteById(id);
			return null;						
	}	
	@DeleteMapping("/users2")
	public List<User2> DeleteUser() {				
            userRepository2.deleteAll();         
			return null;						
	}	

	@PostMapping("/users2")
	public  List<User2> saveUser( @RequestBody final List<User2> user2) {		
		userRepository2.saveAll(user2);

	 return  userRepository2.findAll();	 
	}
	@PostMapping("/users2/{id}")
	public List<User2> saveoneuser(@RequestBody final User2 user2) {
		userRepository2.save(user2);
		return userRepository2.findAll();
	}
	@PutMapping("/users2/{id}")
	public Optional<User2> UpdateUser2(@PathVariable int id,@RequestBody User2 users2) throws AttributeNotFoundException{
		Iterator<User2> iterator=new Iterator<User2>() {		
			@Override
			public User2 next() {			
				return null;
			}			
			@Override
			public boolean hasNext() {			
				return false;
			}
		};		
		while(iterator.hasNext()) {
			User2 user2=iterator.next();
			if(user2.getId()!=id) {
				throw new UserNotFoundException("User is not found in that ID");
				}
		}
		 User2 user2 = userRepository2.findById(id).orElseThrow(() -> new AttributeNotFoundException("Users2 not exist with id: " + id));		
		 if(!(users2.getTitle()==null)) {
			 user2.setTitle(users2.getTitle());
		 }
		 if(!(users2.getDescription()==null)) {
			 user2.setDescription(users2.getDescription());
		 }
		 if(!(users2.getPrice()==null)) {
			 user2.setPrice(users2.getPrice());
		 }
		 if(!(users2.getCategory()==null)) {
			 user2.setCategory(users2.getDescription());
		 }
		 if(!(users2.getImage()==null)) {
			 user2.setImage(users2.getImage());	
		 }
		 if(!(users2.getRating()==null)) {
			 user2.setRating(users2.getRating());
		 }
		 userRepository2.save(user2);
	     return userRepository2.findById(id);
	}		
	@PostMapping("/users2/{id}/rating")
	public  Rate updateRate(@PathVariable int id,@RequestBody Rate rating) {
		User2 user = userRepository2.getOne(id);
		user.setRating(rating);
		User2 updatedUser =  userRepository2.save(user);
		return  updatedUser.getRating();

	}
	
	@DeleteMapping("/users2/{id}/Rating")
	public void  deleteRate(@PathVariable int id) {	
		User2 userrow = userRepository2.getOne(id);		
		Rate i = userrow.getRating();
		userrow.setRating(null);
		User2 updatedUser =  userRepository2.save(userrow);
		ratingRepository2.delete(i);	            
	}
	
}
	
	
	
	
	
	
	
	
	




//for (User2 user22 : user2) {
//if(user22.getDescription().length()>500) {
//	throw new UserNotFoundException("Please Enter Valid Description length");
//}
//}
