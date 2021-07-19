package com.ibs.training.model;

public class FlightResponseBuilder {
	
	private Flight flight;
	
	private Co2 carbonDioxideEmission;

	public FlightResponseBuilder setFlight(Flight flight) {
		this.flight = flight;
		return this;
	}

	public FlightResponseBuilder setCarbonDioxideEmission(Co2 carbonDioxideEmission) {
		this.carbonDioxideEmission = carbonDioxideEmission;
		return this;
	}
	
	
	public FlightResponse getResponse() {
		return new FlightResponse(flight, carbonDioxideEmission);
	}

	
	
	

}
