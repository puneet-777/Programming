package com.puneet.numbersystem;

public class NeonNumber {

	public static boolean IsNeon(int n) {
		int sum=0;
		int sq=n*n;
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
			System.out.println("neon");
		else
			System.out.println("not"); 
			
	}

}
