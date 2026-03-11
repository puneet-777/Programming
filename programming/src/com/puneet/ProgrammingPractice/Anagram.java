package com.puneet.ProgrammingPractice;

import java.util.Arrays;

public class Anagram {
	
	public static boolean isAnagram(String s1,String s2) 
	{
		char ch[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
		if(ch.length != ch2.length)
			return false;
		Arrays.sort(ch);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch, ch2);
		}

	public static void main(String[] args) {
		
		String s1="geeks";
		String s2="ksgees";
		
		if(isAnagram(s1,s2))
			System.out.println("true");
		else {
			System.err.println("false");
		}
		 
	}

}
