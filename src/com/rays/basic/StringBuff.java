package com.rays.basic;

public class StringBuff {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("vijay");
		sb.append("dinnath chouhan");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb);
		System.out.println(sb.charAt(0));
		System.out.println(sb.indexOf("n"));	
		System.out.println(sb.substring(4, 16));
		System.out.println(sb.reverse());
		
	}

}
