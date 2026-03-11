package com.puneet.ProgrammingPractice;

import java.util.Arrays;

public class MoveAllZeroToEnd {
	static int[] moveZero(int[] arr)
	{
		int newarr[]=new int[arr.length];
		int t=0;
		
		for(int i=0;i<arr.length;i++)
		{
				if(arr[i]!=0)
				{
					newarr[t]=arr[i]; 
					t++;	
				}
		}
		return newarr;
	}

	public static void main(String[] args) {
		
		int arr[]= {10,0,0,6,9,0,4,3,0};
		
		int[] res=moveZero(arr);
//		System.out.println(Arrays.toString(res));
		for(int num:res)
		{
			System.out.print(num+" "); 
		}
	}

}
//assginmet 10->11->12
