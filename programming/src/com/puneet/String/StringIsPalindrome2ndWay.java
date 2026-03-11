package com.puneet.String;

public class StringIsPalindrome2ndWay {
	public static boolean Ispalindrome(String s) {
		
		char[] ch=s.toCharArray();
		int i=0;
		int j=ch.length-1;
		while(i<j)
		{
			if(ch[i] != ch[j])
			{
				return false;
			}
			i++;
			j--;
			
		}
		return true;
		
	} 


	public static void main(String[] args) {
		String s="dad";
		
		if(Ispalindrome(s))
			System.out.println("yes");
		else {
			System.out.println("not");
		}
	}

	}


