package com.puneet.numbersystem;

public class CheckNeon {
	public static  boolean IsNeon(int n) {
		int sq=n*n;
		int sum=0;
		while(sq>0) {
			int rem=sq%10;
			sum+=rem;
			sq=sq/10;
		}
		if(n==sum)
			return true;
		else
			return false;

	}
	public static void main(String[] args) {
		int n=9;
		if(IsNeon(n))
			System.out.println("Neon");
		else
			System.out.println("not");
	}

}
