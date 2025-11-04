package com.rays.exception;

public class TestArithemeticException {
public static void main(String[] args) {
	int a = 0;
	int b= 20;
	try {
		int c= b/a;
		System.out.println(c);
	}catch(ArithmeticException e){
		System.out.println("this is ArimeticException");
	}
}
}
