package com.puneet.ProgrammingPractice;


public class RemoveDupFromString { 

	public static void main(String[] args) {
		
		String s="Technologies";
		String st="";
		char[] ch = s.toCharArray();
		boolean ch1[]=new boolean[ch.length];
		
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch1[i]==false)
			{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					ch1[j]=true;
					
				}
			}
			st+=ch[i];
			}
		}
		System.out.println(st);
	
	} 

}
