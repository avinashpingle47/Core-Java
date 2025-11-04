package com.rays.exception;

public class TestNullPointerExeption {
	public static void main(String[] args) {
		String a = null;
		try {
			System.out.println(a.length());
		} catch (NullPointerException e) {
			System.out.println("this is nullpointerException");
		}
	}
}
