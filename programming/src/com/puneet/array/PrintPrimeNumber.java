package com.puneet.array;

public class PrintPrimeNumber {
	public static boolean isPrime(int a) {
		if(a<=1)
			return false;
		for(int i=2;i<=a/2;i++) {
			if(a%i==0)
				return false;
		}
		return true;
	} 

	public static void main(String[] args) {
		
		int a[]= {5,10,15,20,25,3};
		for(int i=0;i<a.length;i++) {
			if(isPrime(a[i]))
				System.out.println(a[i]);
			
		}

	}

}
