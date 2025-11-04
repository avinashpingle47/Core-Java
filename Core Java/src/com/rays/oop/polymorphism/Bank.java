package com.rays.oop.polymorphism;

public class Bank {
	private String name;
	private String Accno;
	private String AccType;
	private Double Balance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccno() {
		return Accno;
	}

	public void setAccno(String accno) {
		this.Accno = accno;
	}

	public String getAccType() {
		return AccType;
	}

	public void setAccType(String accType) {
		this.AccType = accType;
	}

	public Double getBalance() {
		return Balance;
	}

	public void setBalance(Double balance) {
		this.Balance = balance;
	}

	public double interestrate() {
		return 0.0;
	}

	public static Bank getBank(int i) {

		if (i == 1) {
			return new AxisBank();
		}

		if (i == 2) {
			return new HdfcBank();
		}
		return new Bank();
	}
}
