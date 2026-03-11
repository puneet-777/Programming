package com.puneet.String;

public class UppertoLowerToUpper {

	public static void main(String[] args) {

		
		String s="AppLe";
		
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isUpperCase(ch[i]))
			{
				ch[i]=Character.toLowerCase(ch[i]);
			}
			else if (Character.isLowerCase(ch[i])) 
			{
			ch[i]=Character.toUpperCase(ch[i]);	
			}
		}
		System.out.println(ch);
	}

}
