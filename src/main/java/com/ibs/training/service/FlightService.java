package com.ibs.training.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.ibs.training.dao.FlightDao;
import com.ibs.training.model.Co2;
import com.ibs.training.model.Co2Builder;
import com.ibs.training.model.Equivalency;
import com.ibs.training.model.Flight;
import com.ibs.training.model.FlightResponse;
import com.ibs.training.model.FlightResponseBuilder;

@Service
public class FlightService {
	
	@Autowired
	private FlightDao flightdao;
	
	@Value("${vehichle.coefficent}")
	public double vehichleEquivalent;
	
	@Value("${gas.equivalent}")
	 public  double gasEquivalent;
	
	@Value("${smartphone.equivalent}")
	 public  double smartPhoneEquivalent;
	 
	   @Value("${carbon.emission.coefficent}")
	   public  double emissionCoefficent;
	
	public List<FlightResponse> searchFlight( String destinationAirport,String sourceAirport){
		List<Flight> flights=flightdao.getFlightBydestinationAirport(destinationAirport, sourceAirport);
		
		List<FlightResponse> result=flights.stream().map(flight->{
			
			List<Equivalency> listEqu=new ArrayList<Equivalency>();
			
			Equivalency vehichle=new Equivalency();
			vehichle.setValue(Math.round(flight.getDistance()*emissionCoefficent*vehichleEquivalent));
			vehichle.setDescription("Miles driven by an average passenger vehicle");
			listEqu.add(vehichle);
			
			
			
			Equivalency smartPhone=new Equivalency();
			smartPhone.setValue(Math.round(flight.getDistance()*emissionCoefficent*smartPhoneEquivalent));
			smartPhone.setDescription("number of smartphones charged");
			listEqu.add(smartPhone);
			
			
			Equivalency gasoline=new Equivalency();
			gasoline.setValue(Math.round(flight.getDistance()*emissionCoefficent*gasEquivalent));
			gasoline.setDescription("gallons of gasoline consumed");
			listEqu.add(gasoline);
			
			
			
			
			
			
			Co2 carbonFootprint=new Co2Builder().setValue(Math.round(flight.getDistance()*emissionCoefficent)).setUnit("Kg")
					.setEquivalencies(listEqu).getCarbonEmission();
					
			
			FlightResponse flightResponse=new FlightResponseBuilder().setFlight(flight).setCarbonDioxideEmission(carbonFootprint)
					.getResponse();
			
			
			
			return flightResponse;
		}).collect(Collectors.toList());
		
		
		
		return result;
	}

}
