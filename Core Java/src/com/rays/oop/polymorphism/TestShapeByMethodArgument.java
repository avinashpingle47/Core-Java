package com.rays.oop.polymorphism;

public class TestShapeByMethodArgument {

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

		double totalArea = calcArea(s);
		System.out.println("total Area: " + totalArea );
	}

	public static double calcArea(Shape[] s) {

		double totalArea = 0.0;

		for (int i = 0; i < s.length; i++) {
			System.out.println("area: " + s[i].area());
			totalArea = totalArea + s[i].area();
		}

		return totalArea;
	}

}
