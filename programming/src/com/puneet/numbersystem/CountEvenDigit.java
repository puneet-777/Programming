package com.puneet.numbersystem;

public class CountEvenDigit {
	public static int CountEvendigit(int n) {
		int count=0;
		while(n>0){
			int rem=n%10;
			if(rem%2==0)
			count++;
			n=n/10;
		}
		return count;
			
		}
	public static void main(String[] args) {
int n=4597;
	int even=CountEvendigit(n);
	System.out.println("Even :"+even);
	}

}
