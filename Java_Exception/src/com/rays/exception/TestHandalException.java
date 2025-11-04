package com.rays.exception;

public class TestHandalException {
	public static void main(String[] args) {
		int a = 0;
		int b = 15;
		try {
			int c = b / a; // ArithmeticException
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("divided by zero");
		}

		System.out.println("programe is finished");
	}
}