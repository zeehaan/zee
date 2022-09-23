package com.practice.webservices.restfulwebservices.user;

import java.net.URI;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.practice.webservices.restfulwebservices.test5.User2;
@RestController
public class UserResource {	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserDaoService service;
	
	@GetMapping("/users")
	public List<User> retieveAllUsers() {
		return userRepository.findAll();
	}	
	
	@GetMapping("/users/{id}")
	public Optional<User> retriveUser(@PathVariable int id) {
		Optional<User> users=	userRepository.findById(id);
			return users;
	}
	@PostMapping("/users/{id}")
	public void addUser(@PathVariable int id ,@RequestBody User user){
		userRepository.save(user);		
	}
	
	@DeleteMapping("/users/{id}")
	public void DeleteUser(@PathVariable int id) {
		if(userRepository.findById(id)==null) {
			throw new  UserNotFoundException("Cant Dellete a user as he is not found");
		}
		service.deleteById(id);
						
	}	
	
	@PostMapping("/users")
	public  List<User> saveUser( @RequestBody final List<User> user) {
	userRepository.saveAll(user);
return userRepository.findAll();
	
	
//	URI location =ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").
//			buildAndExpand(saveUser.getId()).toUri();	
//	return ResponseEntity.created(location).build();
	}
}



/*
 * [ { "id": 1, "name": "zee", "birthdate": "2022-09-21T10:09:19.713+00:00",
 * "posts": null }, { "id": 2, "name": "manu", "birthdate":
 * "2022-09-21T10:09:19.713+00:00", "posts": null }, { "id": 3, "name":
 * "sameed", "birthdate": "2022-09-21T10:09:19.713+00:00", "posts": null } ]
 */
