package com.puneet.numbersystem;

public class test extends Thread  {
	{
		for(int i=0;i<=25;i++)
		{
			System.out.println("i"+i);
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("handled");
		}
	}
	public static void main(String[] args) {
		
		test t1=new test();
		test t2=new test();
		t1.start();
		t1.start();
	}
}