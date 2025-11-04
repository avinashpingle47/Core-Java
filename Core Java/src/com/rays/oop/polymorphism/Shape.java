package com.rays.oop.polymorphism;

public class Shape {

	private String Color;
	private int Borderwidth;
	public final double PI = 3.14;

	public String getColor() {
		return this.Color;
	}

	public void setColor(String Color) {
		this.Color = Color;
	}

	public int getBorderwitdth() {
		return this.Borderwidth;
	}

	public void setBoderwidth(int Borderwidth) {
		this.Borderwidth = Borderwidth;
	}

	public double area() {
		return 0.0;
	}

	public static Shape getShape(int i) {

		if (i == 1) {
			return new Circle();
		}

		if (i == 2) {
			return new Triangle();
		}

		if (i == 3) {
			return new Rectangle();
		}

		return new Shape();

	}

}
