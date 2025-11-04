package Pratice;

public class PrentCatchBlock {
public static void main(String[] args) {
	String a= "avinash";
	try {
		System.out.println(a.length());
		System.out.println(a.charAt(8));
		System.out.println(a.toLowerCase());
	}catch (Exception e) {
		System.out.println("exception"+e.getMessage());
	}finally {
		System.out.println("finally");
	}
}
}
