package com.puneet.String;

public class StringReverse {

	public static void main(String[] args) {
		String s="Puneet";
		
//		StringBuilder sb= new StringBuilder(s);
//		
//		StringBuilder rev=sb.reverse();
//		
//		String revstr=rev.toString();
//		
//		System.out.println(revstr);  
		
//		System.out.println( new StringBuffer(s).reverse().toString());
		System.out.println(new StringBuilder(s).reverse().toString());
	}

}
