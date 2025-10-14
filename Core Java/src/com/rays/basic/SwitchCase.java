package com.rays.basic;

public class SwitchCase {
public static void main(String[] args) {
	String day= "monday";
	switch(day){
	case"monday":
		System.out.println("first day of week");
		break;
	case"tuesday":
		System.out.println("secand day of week");
		break;
	case"wednesday":
		System.out.println("third day of week");
		break;
	case"thursday":
		System.out.println("forth day of week");
		break;
	case"friday":
		System.out.println("fifth day of weeek");
		break;
	case"saturday":
		System.out.println("sixth day of week");
		break;
		default:
			System.out.println("aaj holiday hai");
		break;
	
	}
}
}
