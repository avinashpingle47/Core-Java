package com.rays.basic;

public class CountDigit {
public static void main(String[] args) {
	String a= "av1na5h001";
	int count= 0;
	for(int i=0; i<a.length(); i++) {
		if(Character.isDigit(a.charAt(i))) {
		count++;	
		}
	}
	System.out.println(count);
}
}
