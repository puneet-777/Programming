package com.puneet.collection;

public class BankApp {

	public static void main(String[] args) {
		
		
		Hdfc h1=new Hdfc();
		h1.CheckBalance();
		h1.send();
		h1.welcome();
		System.out.println();
		ICIC c1=new ICIC();
		c1.CheckBalance();
		c1.send();
		c1.welcome();
	}

}
