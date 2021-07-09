package com.ibs.training.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface FlightDao extends JpaRepository<com.ibs.training.model.Flight, Integer>{

}
