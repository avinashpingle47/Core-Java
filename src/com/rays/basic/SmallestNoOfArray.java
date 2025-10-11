package com.rays.basic;

public class SmallestNoOfArray {
		    public static void main(String[] args) {
		        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		        int Smallest = a[0]; 
		        
		        for (int i = 1; i < a.length; i++) {
		            if (a[i] < Smallest) {
		                Smallest = a[i];
		            }
		        }
		        System.out.println("Smallest number: " + Smallest);
		    }
		}
