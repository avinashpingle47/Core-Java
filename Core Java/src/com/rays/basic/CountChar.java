package com.rays.basic;

public class CountChar {
	public static void main(String[] args) {
		String a = "avinash";
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			if ('i' == a.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
