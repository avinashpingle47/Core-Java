package com.rays.oop.Inheritance;

public class Circle extends Shape{
	private int Redius;

	public int getRedius() {
		return this.Redius;
	}

	public void setRedius(int Redius) {
		this.Redius = Redius;
	}

	public double area() {
		double area = 3.14 * Redius * Redius;
		return area;
	}
}
