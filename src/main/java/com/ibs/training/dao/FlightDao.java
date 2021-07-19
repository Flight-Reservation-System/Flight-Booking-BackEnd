package com.ibs.training.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ibs.training.model.Flight;



@Repository
public interface FlightDao extends JpaRepository<com.ibs.training.model.Flight, Integer>{
	
	//@Query(value = "from Flight where sourceAirport=:sourceAirport and destinationAirport=:destinationAirport")
		//List<Flight> findBysourceAirportAnddestinationAirport(String sourceAirport,String destinationAirport);
		
	   // List<Flight> findBysourceAirportAnddestinationAirport(@Param("sourceAirport")String from, @Param("destinationAirport") String to);

		@Query(value="select * from flight_table f where f.destination_airport=?1 and f.source_airport=?2",nativeQuery=true)
		 public List<Flight> getFlightBydestinationAirport(String destinationAirport,String sourceAirport);

}
