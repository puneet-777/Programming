package com.puneet.ProgrammingPractice;

import java.util.Arrays;
//incomplete......
public class RemoveDupElement {
	public static int[] RemoveDupElement(int arr[]) {
		
		int newarr[]=new int[arr.length];
		int count=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!= arr[i+1])
			{
				newarr[count]=arr[i];
				count++;
			}
		}
		newarr[count++]=arr[arr.length-1];
		
		return newarr; 
	}

	public static void main(String[] args) {
		
		int arr[]= {1, 2, 2, 3, 4, 4, 4, 5, 5};
		
		int[] res=RemoveDupElement(arr);
		System.out.println(Arrays.toString(res));
		
	}

}
