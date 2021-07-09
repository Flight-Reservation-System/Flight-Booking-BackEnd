package com.ibs.training.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.ibs.training.dao.RegisterDAO;
import com.ibs.training.model.User;

import com.ibs.training.status.Status;
@CrossOrigin(origins="http://localhost:3000")
@RestController
public class RegistrationController {

	@Autowired
	RegisterDAO userDao;

	@PostMapping(value = "/users/register",consumes = "application/json")
	public Status registerUser(@RequestBody User newUser) {
		
		System.out.println(newUser);
		System.out.println(newUser.getFullName());
		
//		List<User> users = userDao.findAll();
//		System.out.println("New user: " + newUser.toString());
//		for (User user : users) {
//			System.out.println("Registered user: " + newUser.toString());
//			if (user.equals(newUser)) {
//				System.out.println("User Already exists!");
//				return Status.USER_ALREADY_EXISTS;
//			}
//		}
		userDao.save(newUser);
		return Status.SUCCESS;

	}
	
	
	

}
