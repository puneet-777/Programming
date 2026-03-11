package com.puneet.String;

public class Panagram2 {

	public static void main(String[] args) {
		String s="Aabcdefghijklnmopqrstzyxwvu"; 
		
		if(isPanagram(s))
			System.out.println("panagram");
		else 
			System.out.println("not");
		
	}

	
public static boolean isPanagram(String s) {
	s=s.toLowerCase();
	boolean b[]=new boolean[26];
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		b[ch-97]=true;
		}
	for(int i=0;i<b.length;i++) {
		if(b[i]==false)
			return false;
	}
	
	return true;	
}

}