package com.puneet.ProgrammingPractice;

public class ResuceString{


	public static void main(String[] args) {
		
		String s1="geeksforgeeks";
		char ch[]=s1.toCharArray();
		boolean s2[]= new boolean[s1.length()];
		
		for(int i=0;i<ch.length;i++) {
			if(s2[i]==false) {
				int count=1;
				for(int j=i+1;j<ch.length;j++) {
					if(s1.charAt(i)==s1.charAt(j)) {
						s2[j]=true;
						count++;
					}
				}
				System.out.println(ch[i]+" "+count);
			}
		}

		
	}
}
