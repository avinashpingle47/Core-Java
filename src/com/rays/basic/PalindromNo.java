package com.rays.basic;

public class PalindromNo {
public static void main(String[] args) {
int a=121;
int temp= a;
int r= 0;
int reverse=0;
while(temp>0) {
	r=temp%10;
	reverse=(reverse*10)+r;
	temp=temp/10;
	
}
if(reverse==a) {
	System.out.println(a+"=this is a palindrom no");
}else {
	System.out.println(a+"=this is a not a palindrom no");
}
}
}
