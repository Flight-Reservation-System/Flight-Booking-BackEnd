package com.ibs.training.FlightBookingSpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ibs.training.FlightBookingSpringBoot.dao.RegisterDAO;
import com.ibs.training.FlightBookingSpringBoot.model.User;
import com.ibs.training.FlightBookingSpringBoot.model.UserPrincipal;
@Service
public class LoginUserService implements UserDetailsService {
	@Autowired
	private RegisterDAO repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
		User user=repo.findByUsername(username);
		if(user==null)
			throw new UsernameNotFoundException("User not found");
		return new UserPrincipal(user);
	}

}
