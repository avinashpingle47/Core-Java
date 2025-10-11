package com.rays.basic;

public class TestArrayPostionOfN {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int n = 7;
		int n1 = -1;
		for (int i = 0; i < a.length; i++) {
			if (n == a[i]) {
				System.out.println(i);
			}

			if (n1 == a[i]) {
				
			}
		}
		System.out.println(n1);
	}
}