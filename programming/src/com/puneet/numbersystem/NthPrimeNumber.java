package com.puneet.numbersystem;

import java.util.Scanner;
public class NthPrimeNumber {
	public static boolean IsPrime(int n) {
		if(n<=1)
			return false;
		for(int i=2;i<=n/2;i++) {
			if(n%2==0)
			return false;
			 
		}
		return true;
		
	}
	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number :");
	int n=sc.nextInt();
	int i=2;
	int count=0;
	while(true) {
		if(IsPrime(i)) {
			//System.out.println(i); 
			count++;
		}
		if(count==n) {
			System.out.println(i);
			break;
		}
		i++;
	}
// wronggggggggggggg//
}

}

		
