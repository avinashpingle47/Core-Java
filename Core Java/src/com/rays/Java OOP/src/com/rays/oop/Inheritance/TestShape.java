package com.rays.oop.Inheritance;

public class TestShape {
public static void main(String[] args) {
	System.out.println("-------------circle------------");
	Circle c= new Circle();
	c.setColor("black");
	c.setBoderwidth(5);
	c.setRedius(5);
	System.out.println("color="+c.getColor());
	System.out.println("Boderwidth="+c.getBorderwitdth());
	System.out.println("Redius="+ c.getRedius());
	System.out.println(c.area());
	System.out.println("---------------Rectangle---------------");
	Rectengle r= new Rectengle();
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
	Triangle t=new Triangle ();
	t.setColor("yellow");
	t.setBoderwidth(4);
	t.setBase(15);
	t.setHight(20);
	System.out.println(t.getColor());
	System.out.println(t.getBorderwitdth());
	System.out.println(t.getBase());
	System.out.println(t.getHight());
	System.out.println(t.area());
}
}
