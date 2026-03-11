package com.puneet.ProgrammingPractice;

import java.util.Arrays;

public class ReplaceElementBySum {

	public static void main(String[] args) {

		int arr[]= {12,16,33,145,75};
		
		for(int i=0;i<arr.length;i++)
		{
			int res=ReplaceEle(arr[i]);
			arr[i]=res;
		}
		System.out.println(Arrays.toString(arr)); 
	}

	public static int ReplaceEle(int i) {
		
		int sum=0;
		while(i>0)
		{
			sum+=i%10;
			i=i/10;
		}
		
		return sum; 
	}

}
