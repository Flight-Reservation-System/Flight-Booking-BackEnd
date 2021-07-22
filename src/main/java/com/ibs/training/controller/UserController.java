package com.ibs.training.controller;






import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;


import com.ibs.training.model.User;
import com.ibs.training.model.UserLogin;
import com.ibs.training.service.UserService;
import com.ibs.training.status.Status;
@CrossOrigin(origins="http://localhost:3000")
@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	

	@PostMapping(value = "/users/register",consumes = "application/json")
	public Status registerUser(@RequestBody User newUser) {
		
		
		
//		List<User> users = userDao.findAll();
//		System.out.println("New user: " + newUser.toString());
//		for (User user : users) {
//			System.out.println("Registered user: " + newUser.toString());
//			if (user.equals(newUser)) {
//				System.out.println("User Already exists!");
//				return Status.USER_ALREADY_EXISTS;
//			}
//		}
		userService.registerUser(newUser);
		return Status.SUCCESS;

	}
	
	@PostMapping("/users/login")
	public boolean loginUser(@Valid @RequestBody UserLogin user) {

		return userService.loginUser(user);
	}

//	@PostMapping("/users/logout")
//	public Status logUserOut(@Valid @RequestBody User user) {
//		List<User> users = userDao.findAll();
//		for (User other : users) {
//			if (other.equals(user)) {
//				user.setLoggedIn(false);
//				userDao.save(user);
//				return Status.SUCCESS;
//			}
//		}
//		return Status.FAILURE;
//	}
	
	
	

}
