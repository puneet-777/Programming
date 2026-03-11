package com.puneet.numbersystem;

public class ReverseNumber {
	public static int IsReverse(int n) {
		int rev=0;
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
		
	}

	public static void main(String[] args) {

		int n=1245;
		int res=IsReverse(n);
		System.out.println(res);

}}
