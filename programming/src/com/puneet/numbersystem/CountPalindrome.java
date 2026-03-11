package com.puneet.numbersystem;

public class CountPalindrome {
	public static boolean IsPalindrome(int n) {
		int rev=0;int original=n;
		while(n>0)
		{
		int rem=n%10;
		rev=rev*10+rem;
		n/=10;
		}
		return original==rev;
	}

	public static void main(String[] args) {
		
		int n=121;
		int count=0;
		 for(int i=1;i<1000;i++) {
			 if(IsPalindrome(i))
			 //System.out.println(i);
			 count++;
		 }
		 System.out.println( "count :"+count);
	}

}
