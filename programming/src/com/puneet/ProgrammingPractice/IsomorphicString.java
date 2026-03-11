package com.puneet.ProgrammingPractice;

public class IsomorphicString {
	
	public static boolean isIsomorphic(String s1,String s2) {
		
		for(int i=0;i<s1.length();i++) {
			char c1=s1.charAt(i);
			char c2=s2.charAt(i);
			
			for(int j=0;j<s1.length();j++) {
				
				if(s1.charAt(j)==c1 && s2.charAt(j) != c2) {
					return false;
				} 
				if(s2.charAt(j)==c2 && s1.charAt(j) != c1) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		String s1="abc";
		String s2="xxz";
		
		if(isIsomorphic(s1,s2)) {
			System.out.println("Strings are Isomorphic");
		}
		else {
			System.err.println("Strings are not Isomorphic");
		}
		
	}
}
