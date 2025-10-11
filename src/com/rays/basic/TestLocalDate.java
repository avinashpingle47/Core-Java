package com.rays.basic;

import java.time.LocalDate;
import java.util.Date;

public class TestLocalDate {
	public static void main(String[] args) {
LocalDate now=  LocalDate.now();
System.out.println(now);
System.out.println(now.getDayOfMonth());
System.out.println(now.getDayOfYear());
System.out.println(now.getMonthValue());
System.out.println(now.getYear());
System.out.println(now.getDayOfWeek());
System.out.println(now.getMonth());
System.out.println("---------------------");
   LocalDate Dob= LocalDate.of(2003, 5, 3);
   System.out.println(Dob);
   System.out.println(Dob.getDayOfMonth());
   System.out.println(Dob.getDayOfYear());
   System.out.println(Dob.getMonthValue());
   System.out.println(Dob.getYear());
   System.out.println(Dob.getDayOfWeek());
   System.out.println(Dob.getMonth());
   System.out.println(now.getYear()-Dob.getYear()+"=age");
}
}