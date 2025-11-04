package com.rays.oop.Encapsulation;

import java.util.Date;

public class Person {
	private String Name;
	private Date Dob;
	private String Address;

	public String getName() {
		return this.Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public Date getDob() {
		return this.Dob;
	}

	public void setDob(Date Dob) {
		this.Dob = Dob;
	}

	public String getAdderss() {
		return this.Address;

	}

	public void setAddress(String Address) {
		this.Address = Address;
	}

	public int getAge() {
		Date now = new Date();
		int age = now.getYear() - Dob.getYear();
		return age;

	}

}


