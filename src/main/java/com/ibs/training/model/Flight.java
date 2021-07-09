package com.ibs.training.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FlightTable")
public class Flight {
	
	@Id
	@Column(name="flightId")
	private int flightId;
	
	@Column(name="flightName")
	private String flightName;
	
	@Column(name="Date")
	private String Date;
	
	@Column(name="sourceAirport")
	private String sourceAirport;
	
	@Column(name="destinationAirport")
	private String destinationAirport;
	
	@Column(name="departureHour")
	private int departureHour;
	
	@Column(name="departureMinute")
	private int departureMinute;
	
	@Column(name="arrivalHour")
	private int arrivalHour;
	
	@Column(name="arrivalMinute")
	private int arrivalMinute;
	
	@Column(name="price")
	private int  price;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public int getDepartureHour() {
		return departureHour;
	}
	public void setDepartureHour(int departureHour) {
		this.departureHour = departureHour;
	}
	public int getDepartureMinute() {
		return departureMinute;
	}
	public void setDepartureMinute(int departureMinute) {
		this.departureMinute = departureMinute;
	}
	public int getArrivalHour() {
		return arrivalHour;
	}
	public void setArrivalHour(int arrivalHour) {
		this.arrivalHour = arrivalHour;
	}
	public int getArrivalMinute() {
		return arrivalMinute;
	}
	public void setArrivalMinute(int arrivalMinute) {
		this.arrivalMinute = arrivalMinute;
	}
	public String getSourceAirport() {
		return sourceAirport;
	}
	public void setSourceAirport(String sourceAirport) {
		this.sourceAirport = sourceAirport;
	}
	public String getDestinationAirport() {
		return destinationAirport;
	}
	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}
	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightName=" + flightName + ", Date=" + Date + ", sourceAirport="
				+ sourceAirport + ", destinationAirport=" + destinationAirport + ", departureHour=" + departureHour
				+ ", departureMinute=" + departureMinute + ", arrivalHour=" + arrivalHour + ", arrivalMinute="
				+ arrivalMinute + ", price=" + price + "]";
	}


	}
	


