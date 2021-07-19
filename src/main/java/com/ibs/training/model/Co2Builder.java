package com.ibs.training.model;

import java.util.List;

public class Co2Builder {

	private double value;
	
	private String unit;
	
	
	private List<Equivalency> equivalencies;
	
	public Co2Builder setValue(double value) {
		this.value = value;
		return this;
	}


	public Co2Builder setUnit(String unit) {
		this.unit = unit;
		return this;
	}


	public Co2Builder setEquivalencies(List<Equivalency> equivalencies) {
		this.equivalencies = equivalencies;
		return this;
	}
	
	
	public Co2 getCarbonEmission() {
		return new Co2(value, unit, equivalencies);
	}


	
	
	
}
