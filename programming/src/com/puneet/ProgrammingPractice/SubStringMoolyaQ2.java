package com.puneet.ProgrammingPractice;

public class SubStringMoolyaQ2 {

	public static void main(String[] args) {
		
		String s1="ADOBECODEBANC";
		 String s2="ABC";
		 String small=s1;
		 
		 for(int i=0;i<s1.length();i++) {
			 for(int j=i+1;j<=s1.length();j++) {
				 String sub=s1.substring(i,j);
				 if(isContain(sub,s2)) {
					 if(sub.length()<small.length()) {
						 small=sub;
					 }
				 }
			 }
		 }
		 System.out.println(small); 
	}
	public static boolean isContain(String sub,String target) {
		for(int i=0;i<target.length();i++) {
			char ch=target.charAt(i);
			if(sub.indexOf(ch)==-1) {
				return false;
			}
			
		}
		return true; 
	}
}
