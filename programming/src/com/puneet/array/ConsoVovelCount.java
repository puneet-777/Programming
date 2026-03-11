package com.puneet.array;
//count number of consonet and vovels
public class ConsoVovelCount {

	public static void main(String[] args) {
		String s="AEabcief@#";
		int vc=0;
		int cc=0;
		 s= s.toLowerCase(); 
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			if(Character.isAlphabetic(ch))
			{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
			vc++;
			else 
				cc++;
			}
			}
			
				System.out.println("Vovel="+vc);
				System.out.println("Consonent="+cc);
			
		}
		
	}


