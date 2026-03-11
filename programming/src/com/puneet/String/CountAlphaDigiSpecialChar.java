package com.puneet.String;

public class CountAlphaDigiSpecialChar {

	public static void main(String[] args) {
		
		String s="Puneet@#!%123";
		int dc=0;
		int ac=0;
		int sc=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
			{
				ac++;
			}
			else if(ch>='0' && ch<='9')
			{
				dc++;
			}
			else {
				{
					sc++;
				}
			}
		}
		System.out.println("digit="+dc);
		System.out.println("alpha="+ac);
		System.out.println("specialcount="+sc);
		
	}

}
