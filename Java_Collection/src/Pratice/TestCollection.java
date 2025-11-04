package Pratice;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		Collection c= new ArrayList();
		c.add("Avinash");
		c.add('a');
		c.add(25);
		c.add(25.5);
		c.add(true);
		System.out.println(c);
		System.out.println("----------------");
		for(Object O:c) {
			System.out.println(O);
		}
	}
}
