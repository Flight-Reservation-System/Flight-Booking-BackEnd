package com.ibs.training.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibs.training.model.User;


public interface UserDao extends JpaRepository<User, String> {

	
	User findByUserName(String userName);
}
