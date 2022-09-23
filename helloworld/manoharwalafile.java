package com.practice.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class manoharwalafile {
	
	
	 @GetMapping(path="/hellomanu")
	public String hellomanu() {
		return "hello Manohar";		
	}
	

}
