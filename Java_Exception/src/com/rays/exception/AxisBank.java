package com.rays.exception;

public class AxisBank {
	private double Balance;

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public void withdrawal(double amaunt) throws WithdrawalException {
		if (amaunt > this.Balance) {
			throw new WithdrawalException();
		} else {
			this.Balance = this.Balance - amaunt;
			System.out.println(this.Balance);
		}
	}
}
