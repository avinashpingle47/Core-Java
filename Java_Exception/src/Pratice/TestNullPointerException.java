package Pratice;

public class TestNullPointerException {
	public static void main(String[] args) {
		String a = null;
		try {
			System.out.println(a.length());
		} catch (NullPointerException e) {
			System.out.println("String null hai");
		}
	}
}
