package com.rays.basic;

public class CountVowels {
	public static void main(String[]args) {
	
	String a = "avinash";
	int count = 0;
	for (int i = 0; i < a.length(); i++) {
		if ('a' == a.charAt(i)||'e'==a.charAt(i)||'i'==a.charAt(i)||'o'==a.charAt(i)||'u'==a.charAt(i)) {
			count++;
		}
	}
	System.out.println(count);
}

}

