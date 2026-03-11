package com.puneet.String;

public class ContiniousOccurance2 {

	public static void main(String[] args) {

		
		String s="a3b2c2a2";
		
		char[] ch=s.toCharArray();
		int count=1;
	for(int i=0;i<=ch.length-2;i++)
	{
		if(ch[i]==ch[i+1])
			count++;
		else {
			System.out.print(ch[i]+""+count);
			count=1;
		}
		
	}
	System.out.print(ch[ch.length-1]+""+count);
	}

}
