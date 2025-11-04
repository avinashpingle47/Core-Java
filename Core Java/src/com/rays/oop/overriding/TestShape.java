package com.rays.oop.overriding;

public class TestShape {
	public static void main(String[] args) {
		System.out.println("-------------circle------------");
		Shape s= new Circle();
		Circle c= (Circle)s;
		c.setColor("black");
		c.setBoderwidth(5);
		c.setRedius(5);
		System.out.println("color="+c.getColor());
		System.out.println("Boderwidth="+c.getBorderwitdth());
		System.out.println("Redius="+ c.getRedius());
		System.out.println("area="+c.area());
		System.out.println("---------------Rectangle---------------");
		Shape s1= new Rectangle();
		Rectangle r= (Rectangle)s1;
		r.setColor("white");
		r.setBoderwidth(7);
		r.setBreadth(3);
		r.setLength(6);
		System.out.println("color="+r.getColor());
		System.out.println("Boderwidth="+r.getBorderwitdth());
		System.out.println("Breadth="+r.getBreadth());
		System.out.println("Length="+r.getLength());
		System.out.println("area="+r.area());
		System.out.println("---------------------Triangle-------------------");
		Shape s2=new Triangle ();
		Triangle t=(Triangle)s2;
		t.setColor("yellow");
		t.setBoderwidth(4);
		t.setBase(15);
		t.setHight(2);
		System.out.println("color="+t.getColor());
		System.out.println("Borderwitdth="+t.getBorderwitdth());
		System.out.println("Base="+t.getBase());
		System.out.println("Hight="+t.getHight());
		System.out.println("area="+t.area());
	}
	}
