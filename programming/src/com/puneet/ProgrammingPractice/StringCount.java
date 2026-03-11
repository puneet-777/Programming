package com.puneet.ProgrammingPractice;

public class StringCount {

	public static void main(String[] args) {
		
		String s="aB@1234";
		int ac=0,dc=0,sc=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i); 
			
			if(Character.isAlphabetic(ch))
			{
				ac++;
			}
			else if(Character.isDigit(ch))
			{
				dc++;
			}
			
			else {
				sc++;
			}
		}
		System.out.println(ac+" "+dc+" "+sc);
	}

}
