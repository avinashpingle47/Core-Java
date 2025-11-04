package com.rays.exception;

public class TestLogin {

	public static void main(String[] args) throws LoginException {

		String login = "admin";
		String pwd = "admin1243";

		if (login == "admin" && pwd == "admin124") {
			System.out.println("user login successfully");
		} else {
			throw new LoginException();
		}

	}

}
