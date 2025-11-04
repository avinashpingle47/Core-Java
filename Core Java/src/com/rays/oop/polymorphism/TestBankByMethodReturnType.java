package com.rays.oop.polymorphism;

public class TestBankByMethodReturnType {
	public static void main(String[] args) {
		Bank[] b = new Bank[2];
		b[0] = Bank.getBank(1);
		b[1] = Bank.getBank(2);
		AxisBank a = (AxisBank) b[0];
		a.setName("avinash");
		a.setAccno("59836929155");
		a.setAccType("saving");
		a.setBalance(2000.55);
		HdfcBank h = (HdfcBank) b[1];
		h.setName("vijay");
		h.setAccno("87416966583");
		h.setAccType("current");
		h.setBalance(2142.20);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i].interestrate() + " , " + b[i].getName() + " , " + b[i].getAccno() + " , "
					+ b[i].getAccType() + " , " + b[i].getBalance());
		}
	}
}
