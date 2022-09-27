package com.sanria.test.shared;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 316619025287611646L;

	private Long id;
	
	private String userId;
	
	private String firstName;

	private String lastName;

	private String email;
	
	private String password;
}
