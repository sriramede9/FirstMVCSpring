package com.in28minutes.springmvc;

import java.util.LinkedHashMap;

public class Student {

	private LinkedHashMap<String, String> countryOptions;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
		countryOptions=new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Italy");
		countryOptions.put("IN", "India");
	}

	private String fname;
	private String lname;
	private String country;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
	

}
