package com.rays.oop.polymorphism;

public class TestBankByArray {
public static void main(String[] args) {
	Bank[] b= new Bank[2];
	 b[0]= new AxisBank() ;
	 b[1]= new HdfcBank();
	 AxisBank a= (AxisBank)b[0];
	 a.setName("avinash");
	 a.setAccno("86317232645");
	 a.setAccType("Savaing");
	 a.setBalance(5550.50);
	 HdfcBank h= (HdfcBank)b[1];
	 h.setName("vijay");
	 h.setAccno("95521675");
	 h.setAccType("current");
	 h.setBalance(6000.25);
	 for (int i = 0; i < b.length; i++) {
		System.out.println(b[i].interestrate()+" , "+ b[i].getName()+" , "+ b[i].getAccno()+" , "+ b[i].getAccType()+" , "+b[i].getBalance());
	}
}
}
