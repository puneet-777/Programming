package com.puneet.ProgrammingPractice;

import java.util.Arrays;

public class MissingElementInString{ 
	
	static boolean isMissing(int n,int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
		 if(arr[i]==n)
			 return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String s = "6,1,2,3,8,4";
		String[] ab = s.split(","); 
		int[] a = new int[ab.length];
		for(int i=0;i<ab.length;i++) {
			a[i] = Integer.parseInt(ab[i]);
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a)); 
		
		int small=a[0];
		int big=a[a.length-1];
		
		for(int i=small;i<big;i++)
		{
			if(isMissing(i,a))
				System.out.print(i+" ");
		}
		
	}
	

} 

