package com.puneet.array;

import java.util.Arrays;

public class RotateArrayLeftSide {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int k=2;
		for(int i=k;i<=a.length;i++)
		{
			int temp=a[0];
			for(int j=1;j<=a.length-1;j++) 
			{
				a[j-1]=a[j];
			}
			a[a.length-1]=temp;
		
		}
		  System.out.println(Arrays.toString(a));


}
}