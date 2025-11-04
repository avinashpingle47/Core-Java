package com.rays.oop.Inheritance;

public class Rectengle extends Shape {
	private int Length;
	private int Breadth;

	public int getLength() {
		return this.Length;
	}

	public void setLength(int Length) {
		this.Length = Length;
	}

	public int getBreadth() {
		return this.Breadth;
	}

	public void setBreadth(int Breadth) {
		this.Breadth = Breadth;
	}

	public double area() {
		double area = Length * Breadth;
		return area;
	}
}