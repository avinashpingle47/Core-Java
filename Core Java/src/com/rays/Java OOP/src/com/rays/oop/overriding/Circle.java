package com.rays.oop.overriding;

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
	double area= 3.14*Redius*Redius;
		return area;
	}
	
}



 
