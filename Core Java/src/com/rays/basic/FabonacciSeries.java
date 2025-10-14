package com.rays.basic;

public class FabonacciSeries {
	public static void main(String[] args) {

		int n = 8;
		int a = 0;
		int b = 1;
		int next = 0;
		for (int i = 1; i <= n; i++) {
			next = a + b;
			a = b;
			b = next;

		}
		System.out.println(b);
	}
}
