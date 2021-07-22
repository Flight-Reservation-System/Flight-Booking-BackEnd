package com.ibs.training.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.sql.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.ibs.training.dao.FlightDao;
import com.ibs.training.model.Flight;

class FlightServiceTest {
	
	@Mock
	private FlightDao flightDao;
	
	@BeforeEach
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	Flight mockFlight=new Flight(101,"IndiGo","COK","TVM",12,30,14,20,3500,new Date(2021, 07, 01),new Date(2021, 07, 01),400);
	
	@Test
	void saveFlightTest() {
		when(flightDao.save(mockFlight)).thenReturn(mockFlight);
		
		assertEquals(mockFlight, flightDao.save(mockFlight));
		
	}

}
