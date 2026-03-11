package com.puneet.ProgrammingPractice;

public class MissingElement {
	
	public static boolean isMissing(int i,int arr[])
	{
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]==i)
				return false;
		}
		return true; 
	}

	public static void main(String[] args) {
		
		int arr[]= {12,1,5,9,6,5};
		
		int small=arr[0];
		int big=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<small)
				small=arr[i];
			
			if(arr[i]>big)
			big=arr[i];
		}
		for(int i=small+1;i<big;i++)
		{
			if(isMissing(i,arr))
				
				System.out.println(i);
		}
		
		
	}

}
