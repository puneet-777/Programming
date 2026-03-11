package com.puneet.String;

public class ReverseTheGivenSentence{

	public static void main(String[] args) {
			String s="ram is good";
			String a[]=s.split(" ");
			String store="";
			for(int i=a.length-1;i>=0;i--)
			{
			store=store+a[i]+" ";	
			}

			System.out.println(store);
		
}
	
}