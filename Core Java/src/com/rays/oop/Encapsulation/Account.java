package com.rays.oop.Encapsulation;

public class Account {
	private String AccNo;
	private String AccType;
	private double Balance;

	public String getAccNo() {
		return this.AccNo;

	}

	public void setAccNo(String AccNo) {
		this.AccNo = AccNo;

	}

	public String getAccType() {
		return this.AccType;
	}

	public void setAccType(String AccType) {
		this.AccType = AccType;

	}

	public double getBalance() {
		return this.Balance;

	}

	public void setBalance(double Balance) {
		this.Balance = Balance;

	}

// deposit method
	public void deposit(double amaunt) {
		this.Balance = this.Balance + amaunt;
		System.out.println(this.Balance);

	}

// withdrawal method
	public void withdrawal(double amaunt) {
		this.Balance = this.Balance - amaunt;
		if (this.Balance < amaunt) {
			System.out.println("insufficent fundtransfer");
		} else {

			System.out.println("Balance after withdrawal=" + this.Balance);
		}
	}

// fundtransfer
	public void fundTransfer(Account targetAccount, double amount) {
		if (amount > this.Balance) {

			System.out.println("insufficent found");
		} else {
			this.Balance = this.Balance - amount;
			targetAccount.Balance = targetAccount.Balance + amount;

			System.out.println("transfer" + amount + "from" + this.AccNo + "to" + targetAccount.AccNo);
			System.out.println("your nes balance :" + this.getBalance());
			System.out.println("recevers new balance :" + targetAccount.getBalance());
		}
	}
}
