package com.rays.basic;

public class LargestAndSecandlargestInArray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int largest = 0;
		int secandlargest = 0;
		for (int i = 0; i < a.length; i++) {
			if (i > largest) {
				largest = i;
			}
		}
		System.out.println("largest no=" + largest);
		for (int i = 0; i < a.length; i++) {
			if (i > secandlargest && i < largest) {
				secandlargest = i;
			}
		}
		System.out.println("secandlargest="+secandlargest);
	}	
}