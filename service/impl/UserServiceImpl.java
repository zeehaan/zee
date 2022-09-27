package com.sanria.test.service.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanria.test.domain.User;
import com.sanria.test.repository.UserRepository;
import com.sanria.test.service.UserService;
import com.sanria.test.shared.UserDto;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;   

	@Override
	public UserDto createUser(UserDto userDetail) {
		User user = new User();
		BeanUtils.copyProperties(userDetail, user);
		User dbUser = userRepository.save(user);
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(dbUser, userDto);
		return userDto;
	}

	@Override
	public UserDto getUserById(Long userId) {
		Optional<User> dbUser = userRepository.findById(userId);
		UserDto userDto = null;
		if(dbUser.isPresent()) {
			userDto = new UserDto();
			BeanUtils.copyProperties(dbUser.get(), userDto);
		}
		return userDto;
	}

	@Override
	public UserDto getUserByUUID(String userUUID) {
		Optional<User> dbUser = userRepository.findByUserId(userUUID);
		UserDto userDto = null;
		if(dbUser.isPresent()) {
		 userDto = new UserDto();
		 BeanUtils.copyProperties(dbUser.get(), userDto);
		}
		return userDto;
	}

}
