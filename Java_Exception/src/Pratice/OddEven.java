package Pratice;

public class OddEven {
public static void main(String[] args) {
	int a= 8;
	try {
	if(a%2==0) {
		System.out.println("this is a prime no");
	}else {
		System.out.println("this is a  not a prime no ");
	}
	}catch (ArithmeticException e) {
		System.out.println("exction in program");
	}
}
}
