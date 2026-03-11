package com.puneet.String;

public class ReverseEachWordInSentence {

	public static void main(String[] args) {
		
		String s="ram is good boy";
		
		 String str=reverse(s);
		 
		 System.out.println(str);
	}

	public static String reverse(String s){
		String main=""; 
		String word="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) != ' ')
			{
				word=s.charAt(i)+word;
			}
			else {
				main=main+word+" ";
				word=" ";
			}
		}
		main=main+word;
		
		return main;
	}

}