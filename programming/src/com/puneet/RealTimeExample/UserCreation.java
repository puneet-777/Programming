package com.puneet.RealTimeExample;

public class UserCreation {
public static User createPassword(int password) {
	User user;
	if(password==123) {
		user=new Customer();
	}
	else {
		user=new Admin();
	}
	return user;
}
}
