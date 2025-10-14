package com.rays.basic;

public class SumOfSeven {
	public static void main(String[] args) {
		int Sum = 0;
		for (int i = 100; i < 200; i++) {
			if (i % 7 == 0) {
				Sum = Sum + i;
			}
		}
		System.out.println(Sum);
	}
}
