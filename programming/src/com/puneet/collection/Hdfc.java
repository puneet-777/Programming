package com.puneet.collection;

public class Hdfc  implements Upi{

	@Override
	public void send() {
		System.out.println("Money is transfered form hdfc");
		
	}

	@Override
	public void CheckBalance() {
		System.out.println("check balance of hdfc");
	}
	public void welcome() {
		System.out.println("!! Welcome to UPI !!");
	}

}
