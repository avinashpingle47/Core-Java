package Pratice;

import java.util.ArrayList;
import java.util.List;

public class TestList {
public static void main(String[] args) {
	List a= new ArrayList();
	a.add("avinash");
	a.add("pingle");
	a.add(5);
	a.indexOf(2);
	System.out.println(a);
	a.set(1, "soni");
	System.out.println(a);
	a.get(1);
	System.out.println(a.get(0));
	a.remove(1);
	System.out.println(a);
	
}

}
