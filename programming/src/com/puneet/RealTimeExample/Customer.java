package com.puneet.RealTimeExample;

public class Customer implements User{

	@Override
	public void logIn() {
		System.out.println("Customer Login Successfull...");
	}

	@Override
	public void logOut() {
		
		System.out.println("Customer logout Successful");
	}

}
