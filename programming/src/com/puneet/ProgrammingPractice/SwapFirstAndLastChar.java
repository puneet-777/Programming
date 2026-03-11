package com.puneet.ProgrammingPractice;

import java.util.Arrays;

public class SwapFirstAndLastChar {

	public static void main(String[] args) {
		
		String s="Ram is a Good Boy";
		
				String[] str = s.split(" ");
				
				for(int i=0;i<str.length;i++)
					
				{
					 String w=str[i];
					 if(w.length() >1)
					 {
						 char first=w.charAt(0); 
						 char last=w.charAt(w.length()-1);
						 String mid=w.substring(1,w.length()-1);
						 str[i]=last+mid+first;
						 
					 }
				}
				System.out.println(Arrays.toString(str));
	}

}
