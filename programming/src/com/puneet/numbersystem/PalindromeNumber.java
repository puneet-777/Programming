package com.puneet.numbersystem;

public class PalindromeNumber {
	public static boolean Ispalindrome(int n) {
		int rev=0;
		int temp=n;
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return temp==rev;
		
	}
		public static void main(String[] args) {

			int n=1331;
			if(Ispalindrome(n))
				System.out.println("palindrome");
			else
				System.out.println("not");
	}

}
