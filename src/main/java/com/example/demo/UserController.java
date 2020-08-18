package com.example.demo;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	@Autowired
	UserService userService;

	@PostMapping("/users")
	public User postUser(@Valid @RequestBody User user) {

		return userService.addUser(user);
	}

	@PostMapping("/isUser")
	public boolean getUser(@Valid @RequestBody User user) {
		
			
			User userTemp = userService.getUser(user);
		
			if(userTemp==null)
			return false;
			else
			return true;
		
		
	}

}
