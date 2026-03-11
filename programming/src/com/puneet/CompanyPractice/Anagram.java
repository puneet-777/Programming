package com.puneet.CompanyPractice;

public class Anagram {
public static String sort(String s) {
		
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		String ans=new String(ch);
		return ans; 
	}

	public static void main(String[] args) {
		
		String s1="cat";
		String s2="act";
		
		String s11=sort(s1);
		String s22=sort(s2); 
		
		if(s11.equals(s22)) {
			System.out.println("Anagram");
		}
		else {
			System.err.println("Not");
		}
	}
}
