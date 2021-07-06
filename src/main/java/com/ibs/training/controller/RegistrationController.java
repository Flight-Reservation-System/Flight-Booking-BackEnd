package com.ibs.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ibs.training.model.UserDetails;
import com.ibs.training.service.RegistrationService;

@RestController
@RequestMapping("/user")
public class RegistrationController {
	
	@Autowired
	RegistrationService registrationService;
	
	@PostMapping("/register")
	public String saveUser(UserDetails user) {
		registrationService.saveUser(user);
		return "";
	}
	
	

}
