package com.rays.oop.polymorphism;

public class TestShapeByMethodReturnType {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];
		s[0] = Shape.getShape(1); // new Circle();
		s[1] = Shape.getShape(2); // new Triangle();
		s[2] = Shape.getShape(3); // new Rectangle();

		Circle c = (Circle) s[0];
		c.setColor("blue");
		c.setBoderwidth(8);
		c.setRedius(7);

		Triangle t = (Triangle) s[1];
		t.setBoderwidth(4);
		t.setBase(5);
		t.setColor("red");
		t.setHight(5);

		Rectangle r = (Rectangle) s[2];
		r.setColor("white");
		r.setBreadth(4);
		r.setBoderwidth(2);
		r.setLength(5);

		for (int a = 0; a < s.length; a++) {
			System.out.println("area=" + s[a].area() + ", " + "color=" + s[a].getColor() + ", " + "Boderwidth="
					+ s[a].getBorderwitdth());
		}

	}

}
