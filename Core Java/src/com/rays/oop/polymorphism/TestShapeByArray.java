package com.rays.oop.polymorphism;

public class TestShapeByArray {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];
		s[0] = new Circle();
		s[1] = new Rectangle();
		s[2] = new Triangle();
		Circle c = (Circle) s[0];
		c.setRedius(8);
		c.setColor("black");
		c.setBoderwidth(9);
		Rectangle r = (Rectangle) s[1];
		r.setColor("yellow");
		r.setBoderwidth(5);
		r.setBreadth(3);
		r.setLength(10);
		Triangle t = (Triangle) s[2];
		t.setColor("red");
		t.setBoderwidth(4);
		t.setHight(12);
		t.setBase(7);
		for (int a = 0; a < s.length; a++) {
			System.out.println("area=" + s[a].area() + "," + "color=" + s[a].getColor() + "," + "Boderwidth="+ s[a].getBorderwitdth());
		}
	}
}