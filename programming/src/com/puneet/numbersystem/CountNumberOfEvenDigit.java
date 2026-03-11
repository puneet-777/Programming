package com.puneet.numbersystem;

public class CountNumberOfEvenDigit {
	static int CountEven(int n) {
		int even=0;
		while(n>0) {
			int rem=n%10;
			if(rem%2==0)
				even++;
				n=n/10;
		}
		return even;
	}

	public static void main(String[] args) {
		int n=14568;
		int count=CountEven(n);
		System.out.println(count);
	}

}
