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
	
	@Column(name="arrivalDate")
	private Date arrivalDate;
	
	@Column(name="depatureDate")
	private Date depatureDate;
	
	@Column(name="distance")
	private long distance;
	
	public long getDistance() {
		return distance;
	}
	public void setDistance(long distance) {
		this.distance = distance;
	}
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public Date getDepatureDate() {
		return depatureDate;
	}
	public void setDepatureDate(Date depatureDate) {
		this.depatureDate = depatureDate;
	}
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
	public Flight(int flightId, String flightName, String sourceAirport, String destinationAirport, int departureHour,
			int departureMinute, int arrivalHour, int arrivalMinute, int price, Date arrivalDate, Date depatureDate,
			long distance) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.departureHour = departureHour;
		this.departureMinute = departureMinute;
		this.arrivalHour = arrivalHour;
		this.arrivalMinute = arrivalMinute;
		this.price = price;
		this.arrivalDate = arrivalDate;
		this.depatureDate = depatureDate;
		this.distance = distance;
	}
	public Flight() {
		super();
	}
	
	

	}
	


