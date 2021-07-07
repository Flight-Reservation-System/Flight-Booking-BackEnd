package com.ibs.training.FlightBookingSpringBoot.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="UserTable")
public class User {
@Id
@Column(name="userId")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int userId;

@Column(name="fullName")
private String fullName;

@Column(name="userName")
private String userName;

@Column(name="emailId")
private String emailId;

@Column(name="phoneNumber")
private long phoneNumber;

@Column(name="password")
private String password;

@OneToMany(fetch=FetchType.LAZY, mappedBy="userEntity", cascade= CascadeType.ALL)
private List<Role> getRole;
	

}
