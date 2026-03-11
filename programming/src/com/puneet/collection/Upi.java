package com.puneet.collection;

public interface Upi {
	void send();
	void CheckBalance();
	default void welcome() {
		System.out.println("Welcome To UPI");
	} 

}
