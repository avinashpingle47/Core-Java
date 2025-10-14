package com.rays.basic;

public class PrimeNo {
	public static void main(String[] args) {
		int b = 19;
		int count = 0;
		for (int a = 2; a > 0; a++) {
			if (b % 2 == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println(b+"this is a prime no :");
		} else {
			System.out.println(b+"this is a not a prime no :");
		}
	}
}