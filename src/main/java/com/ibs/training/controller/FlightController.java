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
	private FlightService flightService;

	@PostMapping("/addFlight")
	public Status addFlight(@Valid @RequestBody Flight flight) {


		flightService.saveFlight(flight);
		return Status.SUCCESS;

	}

	@GetMapping("/viewFlight")
	public List<Flight> getAllFlights() {
		return flightService.viewFlghts();
	}

	@DeleteMapping("/deleteFlight/{flightId}")
	public Status removeFlight(@PathVariable("flightId") int Id) {
		flightService.deleteFlight(Id);
		return Status.DELETED;

	}

	// To search flights by destination and source

	@GetMapping("/searchFlightByDestinationandSource/{destinationAirport}/{sourceAirport}")
	public List<FlightResponse> getFlightByDestination(@PathVariable String destinationAirport,
			@PathVariable String sourceAirport) {
		return flightService.searchFlight(destinationAirport, sourceAirport);
	}

}
