package com.puneet.ProgrammingPractice;
//moolya
import java.util.Arrays;

public class primearray {

	

	public static void main(String[] args) {
		
		int arr[]= {10,20,7};
		
		for(int i=0;i<arr.length;i++) {
			
			int prev=prevPrime(arr[i]);
			int next=nextPrime(arr[i]);
			arr[i]=next-prev;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static int nextPrime(int i) {
		
		int n=++i;
		while(true) {
			if(isPrime(n)) {
				return n;
			}
			n++;
		}
	}

	public static int prevPrime(int i) {
		int m=--i;
		while(true) {
			if(isPrime(m)) {
				return m;
			}
			m--;
		}
	}
	public static boolean isPrime(int i) {
		
		if(i<=1) {
			return false;
		}
		for(int j=2;j<=i/2;j++) {
			if(i%j==0){
				return false;
			}
		}
		return true;
	} 
}
