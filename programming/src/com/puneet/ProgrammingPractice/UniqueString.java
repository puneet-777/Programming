package com.puneet.ProgrammingPractice;

public class UniqueString {
	public static boolean isUnique(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j)) 
				{
					return false;
				}
			}
		}
		return true;
	} 

	public static void main(String[] args) {
		String s="abcc";
		
		if(isUnique(s))
			System.out.println("String is unique");
		else {
			System.out.println("String is not unique");
		}
	}

}
