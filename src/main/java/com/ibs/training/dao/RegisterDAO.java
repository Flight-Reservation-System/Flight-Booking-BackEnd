package com.ibs.training.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibs.training.model.User;


public interface RegisterDAO extends JpaRepository<User, String> {

}
