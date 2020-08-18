package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	
	User addUser(User user){
		
		return userRepository.save(user);
	}
	
	User getUser(User user) {
	
		return userRepository.getUser(user.getUserName(), user.getPassword());
	}
}
