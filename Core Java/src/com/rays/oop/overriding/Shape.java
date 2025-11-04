package com.rays.oop.overriding;

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
	public double area () {
		return  0.0;
	}
}
