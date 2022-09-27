package com.sanria.test.service;

import com.sanria.test.shared.UserDto;

public interface UserService {

	public UserDto createUser(UserDto userDetail);

	public UserDto getUserById(Long userId);

	public UserDto getUserByUUID(String userUUID); 
}
