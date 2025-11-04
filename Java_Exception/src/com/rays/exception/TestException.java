package com.rays.exception;

public class TestException {
	public static void main(String[] args) {
		int a = 50;
		int b = 0;
		int c = a / b; // arithmeticException
		System.out.println(c);

		System.out.println("programe is finished...");
	}
}
