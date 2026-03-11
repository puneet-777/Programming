package com.puneet.numbersystem;

public class CountNumOfDigit {
	public static int CountDigit(long  n) {
		int count=0;
		while(n>0){
			long  rem=n%10;
			count++;
			n=n/10;
		}
		return count;
			
		}
	
	public static void main(String[] args) {
		long n=1234567891;
	int res= CountDigit(n);
	System.out.println(res);
		}
	
}
