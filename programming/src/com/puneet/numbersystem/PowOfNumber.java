package com.puneet.numbersystem;

public class PowOfNumber {
	
	public static int PowerIs(int n,int p) {
		
		int pow=1;
		for(int i=0;i<p;i++) {
			pow*=n;
		}
		return pow;
	}

	public static void main(String[] args) {
		
		int n=2;
		int p=10;
		int result=PowerIs(n,p);
		System.out.println(result);
	}

}
