package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestRetainAll {

	public static void main(String[] args) {

		Collection c1 = new ArrayList();

		c1.add("KGF");
		c1.add(24);
		c1.add(24.3);
		c1.add('a');
		c1.add(true);

		System.out.println("c1: " + c1);

		System.out.println("----------");

		Collection c2 = new ArrayList();

		c2.add("KALKI");
		c2.add("KGF");
		c2.add(42);
		c2.add(33.3);
		c2.add('b');
		c2.add(false);
		
		System.out.println("c2: " + c2);
		
		c1.retainAll(c2);
		System.out.println(c1);

	}

}
