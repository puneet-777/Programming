package com.puneet.String;

import java.util.HashSet;

public class Panagram {
	public static boolean isPanagram(String s)
	{
		HashSet hs=new HashSet();
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(Character.isAlphabetic(ch))
			hs.add(ch);
		}
		return hs.size()==26;
	}

	public static void main(String[] args) {
		String s="Aabcdefghijklnmopqrstuvwxyz";
		
		
		if(isPanagram(s))
			System.out.println("panagram");
		else {
			System.out.println("not");
		}
	}

}
//using inbuilt function 
