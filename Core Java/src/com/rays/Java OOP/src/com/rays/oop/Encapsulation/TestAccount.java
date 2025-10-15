package com.rays.oop.Encapsulation;

public class TestAccount {
	public static void main(String[] args) {
		Account a=new Account();
		a.setAccNo("123465545");
		a.setAccType("Saving");
		a.setBalance(5000);
		System.out.println(a.getAccNo());
		System.out.println(a.getAccType());
		System.out.println(a.getBalance());
	a.deposit(500);
	a.withdrawal(500);
	System.out.println("---------------------");
	Account b= new Account();
	b.setAccNo("25526558");
	b.setAccType("current");
	b.setBalance(6000);
	System.out.println(b.getAccNo());
	System.out.println(b.getAccType());
	System.out.println(b.getBalance());
	a.fundTransfer(b, 1000);
	}
}

