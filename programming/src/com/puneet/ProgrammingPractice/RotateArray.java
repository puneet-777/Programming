package com.puneet.ProgrammingPractice;

import java.util.Arrays;

public class RotateArray {
	
	public static int[] rotateArray(int arr[],int k)
	{
		int newarr[]=new int[arr.length];
		int track=0;
		
		for(int i=k;i<arr.length;i++)
		{
			newarr[track]=arr[i];
			track++;
		}
		for(int i=0;i<k;i++)
		{
			newarr[track]=arr[i];
			track++;
		}
		
		return newarr; 
	}

	public static void main(String[] args) {
		
		int arr[]= {2,4,6,8,10,12,14,16}; 
		int k=4;
		
		int[] res=rotateArray(arr,k);
		
		System.out.println(Arrays.toString(res));
	}

}
