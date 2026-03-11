package com.puneet.collection;

public class ICIC implements Upi{

	@Override
	public void send() {
System.out.println("Money is transfered form icic");		
	}

	@Override
	public void CheckBalance() {
System.out.println("check balance of icic");	
	}
}
