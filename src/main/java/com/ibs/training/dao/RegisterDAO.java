package com.ibs.training.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibs.training.model.UserDetails;

public interface RegisterDAO extends JpaRepository<UserDetails, Integer> {

}
