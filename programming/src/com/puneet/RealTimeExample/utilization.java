package com.puneet.RealTimeExample;

public class utilization {
public static void main(String[] args) {
	
	User user1=UserCreation.createPassword(123);
	user1.logIn();
	user1.logOut();
	System.out.println("----------------------------------------");
	User user2=UserCreation.createPassword(456);
	user2.logIn();
	user2.logOut();
}
}
