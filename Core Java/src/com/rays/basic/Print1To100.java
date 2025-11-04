package com.rays.basic;

public class Print1To100 {

	public static void main(String[] args) {
		for (int a = 1; a <= 10; a++) {
			for (int b = 0; b < 10; b++) {
				int num = a + b* 10;
				System.out.print(num + "\t");
			}
			System.out.println();
		}
	}

}
