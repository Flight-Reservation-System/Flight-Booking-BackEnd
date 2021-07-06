package com.ibs.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibs.training.dao.RegisterDAO;
import com.ibs.training.model.UserDetails;

@Service
public class RegistrationService {
	
	@Autowired
	RegisterDAO registerDAO;
	
	public String saveUser(UserDetails user) {
		
		registerDAO.save(user);
		
		return "";
	}

}
