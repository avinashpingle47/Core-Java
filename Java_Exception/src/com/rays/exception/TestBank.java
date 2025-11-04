package com.rays.exception;

public class TestBank {
	public static void main(String[] args) throws WithdrawalException  {

		AxisBank b = new AxisBank();
		b.setBalance(200);
		System.out.println(b.getBalance());
		b.withdrawal(100);
		
	}
}
