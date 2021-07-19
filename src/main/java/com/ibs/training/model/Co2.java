package com.ibs.training.model;

import java.util.List;

public class Co2 {
	
	private double value;
	
	private String unit;
	
	
	private List<Equivalency> equivalencies;

	public double getValue() {
		return value;
	}

	

	public String getUnit() {
		return unit;
	}



	public List<Equivalency> getEquivalencies() {
		return equivalencies;
	}



	public void setEquivalencies(List<Equivalency> equivalencies) {
		this.equivalencies = equivalencies;
	}



	public Co2(double value, String unit, List<Equivalency> equivalencies) {
		super();
		this.value = value;
		this.unit = unit;
		this.equivalencies = equivalencies;
	}

	

}
