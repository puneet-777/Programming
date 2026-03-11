package com.puneet.array;

import java.util.Arrays;
//merge two array into a single array !!
public class MergeArray {
	public static int[] Merge(int a[],int b[]) {
		int c[]=new int[(a.length+b.length)];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int j=0;j<b.length;j++) {
			c[a.length+j]=b[j];
		}
		return c;
	}
	 

	public static void main(String[] args) {
		int a[]= {1,3,5,7,9};
		int b[]= {2,4,6,8,10};
		
		  int c[]=Merge(a,b); 
		System.out.println(Arrays.toString(c));
	}

}
