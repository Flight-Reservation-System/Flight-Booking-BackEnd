package com.ibs.training.FlightBookingSpringBoot.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="UserTable")
public class Role{

	@ManyToOne
	@JoinColumn(name="userId")
	private User userEntity;
	
	@Column(name="roleId")
	private int roleId;
	
	@Column(name="roleType")
	private String roleType;
	
	@Column(name="roleDescription")
	private String roleDescription;
	
	
	
}
