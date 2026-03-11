package com.puneet.array;

import java.util.Arrays;

public class ReverseArrayElements{
	public static int[] reverse(int a[] ) {
		int i=0;
		int j=a.length-1;
		int temp;
		while(i<j)
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		return a; 
	}
			
public static void main(String[] args) {
	
	int a[]= {10,20,30,40,50};
	  a=reverse(a);
			System.out.println(Arrays.toString(a));
	}
}