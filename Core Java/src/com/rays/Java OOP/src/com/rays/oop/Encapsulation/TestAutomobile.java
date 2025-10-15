package com.rays.oop.Encapsulation;

public class TestAutomobile {
public static void main(String[] args) {
	AutoMobile a=new AutoMobile();
	a.setColor("white");
	a.setSpeed(40);
	a.setMake("toyota");
	System.out.println("color="+a.getColor());
	System.out.println("speed="+a.getspeed());
	System.out.println("make="+a.getMake());
	a.Break(10);
	a.Accelerator(50);
	a.changegear(5);
}
}
