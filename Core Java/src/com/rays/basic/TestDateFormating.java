package com.rays.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormating {
	public static void main(String[] args) throws ParseException {
		Date Date = new Date();
		System.out.println(Date);
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy/MM/dd");
		String formatedDate=sdf.format(Date);
		System.out.println(formatedDate);
		System.out.println("-------------------------");
		String Dob="2003/12/6";
		System.out.println(Dob);
		SimpleDateFormat sdf1= new SimpleDateFormat("yyyy/MM/dd");
		Date Datedob=sdf1.parse(Dob);
		System.out.println(Datedob);
	}
}