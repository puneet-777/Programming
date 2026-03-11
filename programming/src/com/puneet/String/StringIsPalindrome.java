package com.puneet.String;

public class StringIsPalindrome {
	public static boolean Ispalindrome(String s) {
		
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		
		return s.equals(rev);		
	}

	public static void main(String[] args) {
		
		String s="aba";
		
		if(Ispalindrome(s))
			System.out.println("yes");
		else {
			System.out.println("not");
		}
	}

}
