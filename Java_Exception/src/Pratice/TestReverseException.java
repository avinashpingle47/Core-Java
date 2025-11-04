package Pratice;

public class TestReverseException {
	public static void main(String[] args) throws ReverseException {
		int a = 2564;
		int temp = a;
		int r = 0;
		int reverse = 0;
		while (temp > 0) {
			r = temp % 10;
			reverse = (reverse * 10) + r;
			temp = temp / 10;
		}
		System.out.println(reverse);
		if(a==temp) {
		System.out.println("this is a revrse no");	
		}else {
			throw new ReverseException();
		}
	}

}
