package com.ibs.training.FlightBookingSpringBoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibs.training.FlightBookingSpringBoot.model.User;
@Repository
public interface RegisterDAO extends JpaRepository<User, Integer> {
	User findByUsername(String username);

}
