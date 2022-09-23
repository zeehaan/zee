//package com.practice.webservices.restfulwebservices.user;
//
//import java.net.URI;
//
//import java.util.List;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//
//@RestController
//public class UserResourceold {
//	
//	@Autowired
//	private UserDaoService service;
//	
//	@GetMapping("/users")
//	public List<User> retieveAllUsers() {
//		return service.findAll();
//	}	
//	
//	@GetMapping("/users/{id}")
//	public User retriveUser(@PathVariable int id) {
//			User user=	service.findOneUser(id);
//			if(user==null)
//				throw new UserNotFoundException("id-"+id);
//				return user;
//	}
//	
//	@DeleteMapping("/users/{id}")
//	public void DeleteUser(@PathVariable int id) {
//			User user=	service.deleteById(id);
//			if(user==null)
//				throw new UserNotFoundException("id-"+id);				
//	}	
//	
//	@PostMapping("/users")
//	public  ResponseEntity<Object> saveUser(@Valid @RequestBody User user) {
//	User saveUser=service.save(user);
//	
//	URI location =ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").
//			buildAndExpand(saveUser.getId()).toUri();	
//	return ResponseEntity.created(location).build();
//	}
//}
