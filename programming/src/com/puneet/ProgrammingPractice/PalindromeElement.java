package com.puneet.ProgrammingPractice;

public class PalindromeElement {
	
	public static boolean isPalindrome(int n)
	{
		int rev=0;
		int st=n;
		
		while(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem; 
			n=n/10;	
		}
		 return rev==st; 
		
	}

	public static void main(String[] args) {
		
		int arr[]= {12,55,16,33,88};
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(isPalindrome(arr[i]))
			{
				count++;
				System.out.println(arr[i]);
			}
		}
		System.out.println(count);
		
	}

}
