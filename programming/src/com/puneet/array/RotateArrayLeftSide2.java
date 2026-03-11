package com.puneet.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArrayLeftSide2 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		
		int k=2;
		int temp[]= new int[a.length];
		
		for(int i=k;i<a.length;i++)
		{
			temp[i-k]=a[i]; 
		}
		for(int i=0;i<k;i++)
		{
		temp[a.length-k+i]=a[i];	 
		}
		System.out.println(Arrays.toString(a));
		
		
	}

}
