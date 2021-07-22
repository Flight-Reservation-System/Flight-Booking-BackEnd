package com.ibs.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibs.training.dao.UserDao;

import com.ibs.training.model.User;
import com.ibs.training.model.UserLogin;

@Service
public class UserService {
	@Autowired
	UserDao userDao;

	public User registerUser(User newUser) {

		return userDao.save(newUser);

	}

	public boolean loginUser(UserLogin user) {
		User userdb = userDao.findByUserName(user.getUserName());
		
			if ((userdb.getPassword()).equals(user.getPassword())) {

				System.out.println("Success");
				return true;
			}
		
		return false;
	}

}
