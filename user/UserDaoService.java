package com.practice.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	private int userCount=3;
private static List<User> users=new ArrayList<>();
	 
	static {		

		users.add(new User(1,"zee",new Date()));
		users.add(new User(2,"manu",new Date()));
		users.add(new User(3,"sameed",new Date()));		
	}
	
	public List<User> findAll(){

		return users;
	}
	
	public User save(User user) {

		if(user.getId()==null) {
			++userCount;
		}
		users.add(user);
		return user;
	}
	
	public User findOneUser(int id) {
		for (User user : users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}
	
	public User deleteById(int id) {
		Iterator<User> iterator=users.iterator();
		while(iterator.hasNext()) {
			User user=iterator.next();
			iterator.remove();
				return user;
				} 		
		return null;
	}

}
