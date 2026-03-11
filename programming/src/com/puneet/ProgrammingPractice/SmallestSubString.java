package com.puneet.ProgrammingPractice;

public class SmallestSubString {
	public static boolean isContain(String sub,String target) {
		for(int i=0;i<target.length();i++) {
			char ch=target.charAt(i);
			if(sub.indexOf(ch)== -1)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		String s1="ACDBXMAYBMNC";
		String s2="ABC";
		String smallest=s1;
		for(int i=0;i<s1.length();i++) {
			for(int j=i;j<s1.length();j++) {
				String sub=s1.substring(i,j);
				if(isContain(sub,s2))
				{
					if(sub.length()<smallest.length())
					{
						smallest=sub;
					}
				}
				
			}
		}
	}
}
