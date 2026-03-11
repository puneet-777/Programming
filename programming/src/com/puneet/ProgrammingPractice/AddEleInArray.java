package com.puneet.ProgrammingPractice;

import java.util.Arrays;

public class AddEleInArray {
	
	public static int[] AddEle(int n,int arr[],int x)
	{
		int newarr[]=new int[n+1];
		
		for(int i=0;i<n;i++)
		{
			newarr[i]=arr[i];
			
			newarr[n]=x;
		}
		
		return newarr;
	}

	public static void main(String[] args) {
		
		int n=5;
		int arr[]= {1,2,3,4,5};
		int x=6;
		
		int[] res = AddEle(n,arr,x);
		System.out.println(Arrays.toString(res));
	}

}
