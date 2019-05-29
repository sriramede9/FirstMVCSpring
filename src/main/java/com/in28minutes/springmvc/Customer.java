package com.in28minutes.springmvc;

import javax.validation.constraints.NotNull;

import javax.validation.constraints.Size;

public class Customer {

	private String fname;
	
	@NotNull()
	@Size(min = 1,message = "is required")
	private String lname;

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

}
