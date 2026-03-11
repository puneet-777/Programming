package com.puneet.array;
//count the no of palindrome in the given array
public class PalindromeInArray {
	public static boolean isPalindrome(int  a) {
		int rev=0;
		int temp =a;
		while(a>0)
		{
			int rem=a%10;
			rev=rev*10+rem;
			a=a/10;
			
		}
		return temp==rev; 
	}

	public static void main(String[] args) {

		int a[]= {12,121,143,55,22,15};
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(isPalindrome(a[i]))
				count++;
				//System.out.println(a[i]);
		}
		System.out.println("count="+count);
	}

}
