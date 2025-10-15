package com.rays.oop.Encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws ParseException  {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Person a = new Person();
		a.setName("Avinash");
		a.setAddress("indore");
		a.setDob(sdf.parse("2003-05-03"));

		System.out.println(a.getName());
		System.out.println(a.getAdderss());
		System.out.println(a.getDob());
		System.out.println(a.getAge());

	}
}
