package com.rays.basic;

public class ArmstrongNo {
	public static void main(String[] args) {
		int a = 153;
		int temp = a;
		int r = 0;
		int sum = 0;

		while (temp > 0) {
			r = temp % 10;
			r = r * r * r;
			sum = sum + r;
			temp = temp / 10;
		}
		if (sum == a) {
			System.out.println(a + " = this is a armstrong no");
		} else {
			System.out.println(a + " = this is a not armstrong no");
		}
	}
}
