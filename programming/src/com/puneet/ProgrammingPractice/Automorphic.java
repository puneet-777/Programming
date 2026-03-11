package com.puneet.ProgrammingPractice;

public class Automorphic {
	
	public static boolean isAutomorphic(int n)
	{
		int sq=n*n;
		
		while(n>0)
		{
			if(sq%10 == n%10)
			{
				return true;
			} 
			n=n/10;  
			sq=sq/10;
		}
		return false; 
	}

	public static void main(String[] args) {
		
		int n= 625;
		
		if(isAutomorphic(n))
			System.out.println("automorphic");
		else {
			System.out.println("not");
		}
		
		
		
		
	}

}
