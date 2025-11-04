package Pratice;

public class TestLogin {
public static void main(String[] args) throws LoginException {
	String login= "admin";
	String password= "avinash@?";
	if(login=="admin" & password=="avinash@") {
		System.out.println("user login successfully");
	}else {
		throw new LoginException();
	}
}
}
