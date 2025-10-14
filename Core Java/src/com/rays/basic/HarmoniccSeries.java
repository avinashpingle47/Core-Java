package com.rays.basic;

public class HarmoniccSeries {
public static void main(String[] args) {
	int a=8;
	double sum=0.0;
	for (int i=1; i<=a; i++) {
		sum+= 1.0/i;		
}
	System.out.println(sum);
}
}
