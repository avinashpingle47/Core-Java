package Pratice;

public class TestIndexOutOfBondException {
 public static void main(String[] args) {
	String a= "avinash";
	try { 		
		System.out.println(a);
	}catch(IndexOutOfBoundsException e) {
		System.out.println("index out of bond h");
	}
}
}