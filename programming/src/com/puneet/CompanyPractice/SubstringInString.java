package com.puneet.CompanyPractice;
	public class SubstringInString {
		public static void main(String[] args) {
			String s="aabbajkjyuhuyhkj";
			for(int i=0;i<s.length();i++) {
				String temp=""+s.charAt(i);
				for(int j=i+1;j<s.length();j++) {
					temp=temp+s.charAt(j);
					System.out.println(temp);
				}
			}
			
		}
}
