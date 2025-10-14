package com.rays.basic;

public class ReverseNo {
public static void main(String[] args) {
	int a=12345;
	int temp=a;
	int r=0;
	int reverse=0;
	while (temp>0) {
	r=temp%10;
	reverse=(reverse*10)+r;
	temp=temp/10;
	}
	System.out.println(reverse);
}
}
