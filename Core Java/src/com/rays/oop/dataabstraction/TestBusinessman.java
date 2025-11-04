package com.rays.oop.dataabstraction;

public class TestBusinessman {
	
	public static void main(String[] args) {
		
		// Richman r = new Richman(); WRONG X
		Richman r = new Businessman();
		
		r.donation();
		r.earnMoney();
		r.party();
		
		// SocialWorkdr s = new SocialWorker(); WRONG X
		SocialWorker s = new Businessman();
		
		s.helpToOther();
		
	}

}
