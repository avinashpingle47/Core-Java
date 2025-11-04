package Pratice;

public class Reverse {
	public static void main(String[] args) {
		int a = 23654;
		int temp = a;
		int r = 0;
		int reverse = 0;
		try {
			while (temp > 0) {
				r = temp % 10;
				reverse = (reverse * 10)+r ;
				temp = temp / 10;
			}
			System.out.println(reverse);
		} catch (ArithmeticException e) {
			System.out.println("exception in programe");
		}
	}
}
