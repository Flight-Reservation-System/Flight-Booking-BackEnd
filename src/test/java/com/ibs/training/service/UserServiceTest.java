package com.ibs.training.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.ibs.training.dao.UserDao;
import com.ibs.training.model.User;
import com.ibs.training.model.UserLogin;

class UserServiceTest {
	
	@Mock
	private UserDao userdao;
	
	@BeforeEach
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	User mockUser=new User(1,"aswin", "aswinpm", "@gmail.com", 8976464, "12456");

	@Test
	void testRegisterUser() {
		
		when(userdao.save(mockUser)).thenReturn(mockUser);
		
		assertEquals(userdao.save(mockUser), mockUser);
	}
	
	@Test
	void userloginSucess() {
		UserLogin userLogin=new UserLogin("aswinpm", "12456");
		when(userdao.findByUserName(userLogin.getUserName())).thenReturn(mockUser);
		assertEquals(userLogin.getPassword(), mockUser.getPassword());
		
	}
	
	@Test
	void userloginFail() {
		UserLogin userLogin=new UserLogin("aswinpm", "123456");
		when(userdao.findByUserName(userLogin.getUserName())).thenReturn(mockUser);
		assertNotEquals(userLogin.getPassword(), mockUser.getPassword());
		
	}

}
