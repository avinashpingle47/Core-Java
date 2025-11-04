package Pratice;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionMethod {
public static void main(String[] args) {
	Collection c= new ArrayList();
	c.add("Avinash");
	c.add(25);
	c.add(25.5);
	c.add('a');
	c.add(true);
	c.add("indore");
	Collection d= new ArrayList();
	d.add("pingle");
	d.add(50);
	d.add(55.5);
	d.add('b');
	d.add(false);
	d.add("indore");
	System.out.println("1"+c);
	System.out.println("----------------");
	System.out.println("2"+d);
	System.out.println("-------------------");
	c.addAll(d);
	System.out.println("3"+ c);
	System.out.println("---------------------");
	System.out.println("4"+c.contains('a'));
	System.out.println("5"+d.contains("pingle"));
	System.out.println("------------------------");
	System.out.println("6"+c.containsAll(d));
	System.out.println("------------------------------");
	System.out.println("7"+c.isEmpty());
	System.out.println("------------------------------");
	
	System.out.println("8"+c);
	System.out.println("9"+c);
	System.out.println("-----------------------------");
	c.size();
	d.size();
	System.out.println("10="+c.size());
	System.out.println("11="+d.size());
	System.out.println("--------------------------------");
	
}
}










