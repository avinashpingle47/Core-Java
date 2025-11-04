package com.rays.exception;

public class TestIndexOutOfBondExeption {
public static void main(String[] args) {
	String a= "avinash";
	try {
		System.out.println(a.charAt(8));
	}catch(IndexOutOfBoundsException e) {
		System.out.println("this is IndexOutOfBoundsException");
	}
} 
}
