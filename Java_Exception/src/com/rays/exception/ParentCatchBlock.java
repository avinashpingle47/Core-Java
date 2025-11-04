package com.rays.exception;

public class ParentCatchBlock {

	public static void main(String[] args) {

		String name = "Ram";

		try {
			System.out.println("lenght: " + name.length());
			System.out.println(name.charAt(2));
		} catch (Exception e) {
			System.out.println("exception: " + e.getMessage());
		} finally {
			System.out.println("me pandit hoon");
		}

	}

}
