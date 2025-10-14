package com.rays.basic;

public class SwpingwithOutThirdVariable {
public static void main(String[] args) {
	int a=40;
	int b=55;
	System.out.println("before Swaping");
	System.out.println("a="+a);
	System.out.println("b="+b);
	System.out.println("-------------------");
	b=b-a;
	a=b+a;
	b=a-b;
	System.out.println("after Swping");
	System.out.println("a="+a);
	System.out.println("b="+b);
}
}
