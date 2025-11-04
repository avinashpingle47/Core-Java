package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionMethods {

	public static void main(String[] args) {

		Collection c1 = new ArrayList();

		c1.add("KGF");
		c1.add(24);
		c1.add(24.3);
		c1.add('a');
		c1.add(true);

		System.out.println("c1: " + c1);
		System.out.println(c1.contains(24));
		System.out.println(c1.contains('b'));
		

		System.out.println("----------");
		
		Collection c2 = new ArrayList();

		c2.add("KALKI");
		c2.add(42);
		c2.add(33.3);
		c2.add('b');
		c2.add(false);
		System.out.println(c1.containsAll(c2));
		
		System.out.println("c2: " + c2);
		System.out.println(c2.remove(false));
		System.out.println("c2: " + c2);
		
		System.out.println("---------");
		
		c1.addAll(c2);
		System.out.println(c1.containsAll(c2));
		
		System.out.println("c1: " + c1);
		c1.removeAll(c2);
		System.out.println("c1: " + c1);
		System.out.println("c1 size: " + c1.size());
		System.out.println("c1 empty hai: " + c1.isEmpty());
		c1.clear();
		System.out.println("c1 size: " + c1.size());
		System.out.println("c1 empty hai: " + c1.isEmpty());

	}

}
