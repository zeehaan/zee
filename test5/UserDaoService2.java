package com.practice.webservices.restfulwebservices.test5;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Column;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException.BadRequest;
import org.springframework.web.server.ResponseStatusException;

import com.ctc.wstx.shaded.msv_core.verifier.ErrorInfo.BadAttribute;

@Component
public class UserDaoService2 {
	private int userCount2=3;
private static List<User2> users2=new ArrayList<>();

	public User2 save(User2 user2) {
		if(user2.getId()==null) {
			++userCount2;
		}
		users2.add(user2);
		return user2;
	}
	
	public User2 findOneUser(int id) {

		for (User2 user2 : users2) {
			if(user2.getId()==id) {
				return user2;
			}
		}
		 throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not Found");
	}
	
	public List<User2> deleteById(int id) {
		Iterator<User2> iterator=users2.iterator();
		while(iterator.hasNext()) {
			User2 user2=iterator.next();
			iterator.remove();
				return users2;
				} 		
		return null;
	}

}
