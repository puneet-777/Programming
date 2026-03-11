package com.puneet.numbersystem;

import java.util.Scanner;

public class SumOfStrongNumber {
	public static boolean IsStrong(int n) {
	int	sum=0;
	int temp=n;
		while(n>0) {
			int rem=n%10;
			int fact=factorial(rem);
			//sum=sum+factorial(n%10);
			sum=sum+fact;
			n=n/10;
		}
		return sum==temp; 
	}
	static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number :");
	int n=sc.nextInt();
	int sum=0;
	for(int j=1;j<=n;j++) {
		if(IsStrong(j))
			sum=sum+j;
	}
	System.out.println("Sum :"+sum);
	
	
	}

}
