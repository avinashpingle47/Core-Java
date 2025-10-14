package com.rays.basic;

public class StringBuff {
	public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("avinash");
	sb.append("pingle");
	System.out.println(sb);
	System.out.println(sb.capacity());
	System.out.println(sb.length());
	System.out.println(sb.charAt(0));
	System.out.println(sb.indexOf("p"));
	System.out.println(sb.substring(5, 10));
	
	}

}
