package com.ibs.training.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibs.training.dao.FlightDao;
import com.ibs.training.model.Flight;
import com.ibs.training.model.FlightResponse;
import com.ibs.training.service.FlightService;
import com.ibs.training.status.Status;

@CrossOrigin
@RestController
@RequestMapping("/flight")
public class FlightController {

	@Autowired
	private FlightDao flightdao;
	
	@Autowired
	private FlightService flightService;
	
	@PostMapping("/addFlight")
	public Status addFlight(@Valid @RequestBody Flight flight) {

		System.out.println(flight.getArrivalDate());

//		  List <Flight> flights = flightdao.findAll();
//	        System.out.println("New flight: " + flight.toString());
//	        for (Flight flightsall : flights) {
//	            //System.out.println("Registered user: " + newUser.toString());
//	            if (flight.equals(flightsall)) {
//	                System.out.println("Flight Already exists!");
//	                return Status.FLIGHT_ALREADY_EXISTS;
//	            }
//	        }

		flightdao.save(flight);
		return Status.SUCCESS;

	}

	@GetMapping("/viewFlight")
	public List<Flight> getAllFlights() {
		return flightdao.findAll();
	}

	@DeleteMapping("/deleteFlight/{flightId}")

	public Status removeFlight(@PathVariable("flightId") int Id) {
		flightdao.deleteById(Id);
		return Status.DELETED;

	}
	
	//To search flights by destination and source
	
		@GetMapping("/searchFlightByDestinationandSource/{destinationAirport}/{sourceAirport}")
		public  List<FlightResponse> getFlightByDestination(@PathVariable String destinationAirport,@PathVariable String sourceAirport){
			return flightService.searchFlight(destinationAirport,sourceAirport); 
		}
		
		
	
}
