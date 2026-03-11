package com.puneet.numbersystem;

public class NumberIsOdd {
	
public static boolean IsOdd(int n) {
	
	while(n>0) {
		int rem=n%10;
		
		if(rem%2 !=0) 
			return false;
			n=n/10;	
	}
	return true;
}
	public static void main(String[] args) {
		int n=137;
		if(IsOdd(n))
		System.out.println("true");
		else
			System.out.println("no");
	}

}
