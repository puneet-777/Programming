package com.puneet.ProgrammingPractice;

public class HelloPattern {
	
public static void main(String[] args) {
	
	String s="hello";
	int sp=s.length()*2-3;
	
	for(int i=0;i<s.length();i++)
	{
		for(int j=0;j<=i;j++)
		{
	System.out.print(s.charAt(j));
		}
		for(int k=0;k<=sp;k++)
		{
			System.out.print(" ");
		}
		for(int l=i;l>=0;l--)
		{
			if(l==i&&i==s.length()-1)
				continue;
			System.out.print(s.charAt(l));
		}
		sp-=2;
		System.out.println();
		
	}
}
}
