package com.puneet.numbersystem;

public class SumOfDigitTillSingle {
static int SumOfEachDigit(int n) {
	while(n>=10) {
	int sum=0;
	while(n>0) {
		int rem=n%10;
		sum+=rem;
		n/=10;	
	}
	n=sum;
	}
return n;
	
}
	
public static void main(String[] args) {
	int n=7846;
	System.out.println(SumOfEachDigit(n));
}
}
