package com.rays.oop.dataabstraction;

public class Businessman implements Richman, SocialWorker {

	@Override
	public void earnMoney() {
		System.out.println("earn Money");
	}

	@Override
	public void donation() {
		System.out.println("donation");
	}

	@Override
	public void party() {
		System.out.println("party");
	}

	@Override
	public void helpToOther() {
		System.out.println("help to other");
	}

}
