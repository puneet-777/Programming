package com.puneet.numbersystem;

public class CheckSPYNumber {
	public static boolean IsSpy(int n) {
		int sum=0;
		int product=1;
		while(n>0) {
			int rem=n%10;
			sum+=rem;
			product*=rem;
			n=n/10;
		}
		if(sum==product)
				return true;
		return false;
	}
	public static void main(String[] args) {
	int n=1325;
		if(IsSpy(n))
		System.out.println("Spy");
		else
			System.out.println("not");
		
	}

}
