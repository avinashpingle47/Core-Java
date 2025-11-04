package com.rays.oop.polymorphism;

public class Circle extends Shape {
	private int Redius ;

	public int getRedius() {
		return Redius;
	}

	public void setRedius(int redius) {
		Redius = redius;
	}
	@Override
	public double area() {
	double area= PI * Redius * Redius;
		return area;
	}
	
}



 
