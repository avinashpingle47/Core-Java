package com.rays.oop.Encapsulation;

public class AutoMobile {
	private String Color;
	private int Speed;
	private String Make;
	public static final int NO_OF_GEARS = 6;

	public String getColor() {
		return this.Color;
	}

	public void setColor(String Color) {
		this.Color = Color;
	}

	public int getspeed() {
		return this.Speed;
	}

	public void setSpeed(int Speed) {
		this.Speed = Speed;
	}

	public void Accelerator(int Speed1) {
		Speed = Speed + Speed1;
		System.out.println(Speed);

	}

	public String getMake() {
		return this.Make;
	}

	public void setMake(String Make) {
		this.Make = Make;
	}

	public void Break(int break1) {
		Speed = Speed - break1;
		if (Speed < 0) {
			Speed = 0;
		}
		System.out.println(this.Speed);
	}

	public void changegear(int gear) {
		if (gear > 0 && gear <= NO_OF_GEARS) {
			System.out.println("gear changed to=" + gear);
		} else {
			System.out.println("invalid gear plz select gear between 1 and " + NO_OF_GEARS);
		}
	}
}


