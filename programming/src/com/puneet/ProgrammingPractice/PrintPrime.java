package com.puneet.ProgrammingPractice;

public class PrintPrime {
	
	public static boolean isPrime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0) 
				return false;
		}
		return true; 
	}

	public static void main(String[] args) {
		
		int arr[]= {12,14,84,13,1,2,5};
		
		for(int i=0;i<arr.length;i++)
		{
			if(isPrime(arr[i]))
				System.out.println("Prime "+arr[i]);
		}
	}

}
