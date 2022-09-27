package com.sanria.test.request.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserRequestModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6749409881669875206L;

	private String firstName;

	private String lastName;

	private String email;

	private String password;

}
