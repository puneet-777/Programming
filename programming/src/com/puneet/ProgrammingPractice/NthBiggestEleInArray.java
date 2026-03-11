package com.puneet.ProgrammingPractice;

import java.util.Arrays;

public class NthBiggestEleInArray {

	public static void main(String[] args) {
		
		int arr[]= {12,45,6,78,41,65};
		int n=1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				}
			}
		}
		System.out.println("Biggest="+arr[n-1]);
		System.out.println(Arrays.toString(arr));
	}
}
