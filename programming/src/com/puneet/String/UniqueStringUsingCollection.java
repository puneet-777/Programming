package com.puneet.String;

import java.util.HashSet;

public class UniqueStringUsingCollection {
	
	public static boolean isUnique(String s) {
		
		HashSet<Character> hSet=new HashSet<>();
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			hSet.add(ch);
		}
		
		return s.length()==hSet.size(); 
		
	}

	public static void main(String[] args) {

		
		String s="pune";
		
		if(isUnique(s))
			System.out.println("yes");
		else {
			System.err.println("no");
		}
	}

}
