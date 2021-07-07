package com.ibs.training.FlightBookingSpringBoot.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class HomeController {
	boolean loginStatus=false;
	@GetMapping("/")
	public String home() {
		return("<h1> Welcome </h1>");
	}
	@GetMapping("/home")
	public String user() {
		return("<h1> Welcome Litmus User </h1>"
				+ "<h3> Have a good day</h3>");
	}
	@GetMapping("/adminPortal")
	public String admin() {
		return("<h1> Welcome Admin </h1>"
				+ "<h3><em> Keep browsing and explore your admin privileges </em></h3>");
	}
}
