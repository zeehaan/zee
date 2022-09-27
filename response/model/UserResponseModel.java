package com.sanria.test.response.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserResponseModel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7761541394923715362L;

	private String userId;
	
	private String firstName;

	private String lastName;

	private String email;
	
	
}
