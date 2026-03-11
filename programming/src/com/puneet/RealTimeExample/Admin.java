package com.puneet.RealTimeExample;

public class Admin implements User{

	@Override
	public void logIn() {
		System.out.println("Admin login Successful...");
	}

	@Override
	public void logOut() {
		System.out.println("Admin logout Successful...");
	}

}
