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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserJPAResource {
	
	@Autowired
	private UserDaoService service;	
	
	@Autowired
	PostRepository postRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/jpa/users")
	public List<User> retieveAllUsers() {
		return  userRepository.findAll(); 
	} 
	
	@GetMapping("/jpa/users/{id}")
	public Optional<User> retriveUser(@PathVariable int id) {
			Optional<User> user=	userRepository.findById(id);
			if(user==null)
				throw new UserNotFoundException("id-"+id);
				return user;
	}
	
	@DeleteMapping("/jpa/users/{id}")
	public void DeleteUser(@PathVariable int id) {
			userRepository.deleteById(id);		

	}	
	
	@PostMapping("/jpa/users")
	public  ResponseEntity<Object> saveUser(@Valid @RequestBody User user) {
	User saveUser =userRepository.save(user);
	
	URI location =ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saveUser.getId()).toUri();
	
	return ResponseEntity.created(location).build();
	}	

//	@GetMapping("/jpa/users/{id}/posts")
//	public Post retieveAllUsers(@PathVariable int id) {		 
//		 Optional<User>  userOptional=userRepository.findById(id); 
//		 if(!userOptional.isPresent()) {
//			 throw new UserNotFoundException("id-"+id);
//		 }
//		 return userOptional.get().getPosts();
//	} 

	@PostMapping("/jpa/users/{id}/posts")
	public  ResponseEntity<Object> createPost(@PathVariable int id,
			@RequestBody Post post) {
	Optional<User> userOptional=userRepository.findById(id);
	if(!userOptional.isPresent()) {
		throw new UserNotFoundException("id-"+id);	
		}
	
	User user =userOptional.get( );
	post.setUser(user);	
	
	postRepository.save(post);
	
	
	URI location =ServletUriComponentsBuilder.fromCurrentRequest().
			path("/{id}").buildAndExpand(user.getId()).toUri();
	
	return ResponseEntity.created(location).build();
	
}
}
