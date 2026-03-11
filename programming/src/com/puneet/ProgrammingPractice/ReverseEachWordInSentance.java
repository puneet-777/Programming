package com.puneet.ProgrammingPractice;

public class ReverseEachWordInSentance {
	
	public static String reverse(String s)
	{
		return new StringBuilder(s).reverse().toString();  	
	}

	public static void main(String[] args) {
		
		String s="scanner is class";
		String str[]=s.split(" ");
		String revset=""; 
		for(int i=0;i<str.length;i++)
		{
			String st=reverse(str[i]); 
			revset=revset+st+" ";	
		}
		System.out.println("Reversed="+revset);
	}

}
