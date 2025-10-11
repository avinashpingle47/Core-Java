package com.rays.basic;

public class TestArray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(a[0] + "," + a[1]);
		System.out.println(a[0 + a[1]]);
		System.out.println(a.length);
		for (int b : a) { // this is a foreach statement
			System.out.println(b);
		}

	}
}