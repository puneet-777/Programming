package com.puneet.String;

import java.util.HashMap;

public class OptimalLogicOccuranceOfString {

	public static void main(String[] args) {
		String s="abababcc";
		
		HashMap<Character,Integer> m=new HashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++)
		{
			m.put(s.charAt(i),m.getOrDefault(s.charAt(i), 0)+1);
		}
		System.out.println(m);
	}

}
