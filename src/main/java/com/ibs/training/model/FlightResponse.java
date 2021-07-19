package com.ibs.training.model;



public class FlightResponse {
	
	
	private Flight flight;
	
	
	private Co2 carbonDioxideEmission;
	
	


	public FlightResponse(Flight flight, Co2 carbonDioxideEmission) {
		super();
		this.flight = flight;
		this.carbonDioxideEmission = carbonDioxideEmission;
	}



	public Flight getFlight() {
		return flight;
	}


	


	public Co2 getCarbonDioxideEmission() {
		return carbonDioxideEmission;
	}


	


	

}
