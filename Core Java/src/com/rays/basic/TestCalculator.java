package com.rays.basic;

import java.util.Scanner;

public class TestCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first no");
		int a = sc.nextInt();
		System.out.println("enter secand no");
		int b = sc.nextInt();
		System.out.println("+,-,*,/,%");
		String c = sc.next();
		System.out.println("result");
		switch (c) {
		case "+":
			System.out.println(a + b);
			break;
		case "-":
			System.out.println(a - b);
			break;
		case "*":
			System.out.println(a * b);
			break;
		case "/":
			System.out.println(a / b);
			break;
		case "%":
			System.out.println(a % b
					);
			break;
		default:
			System.out.println("error");
		}

	}
}
