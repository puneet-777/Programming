package com.puneet.array;

import java.util.Arrays;

public class MergeTwoSortedArrayInSingle  {
private static int[] mergeAndsort(int a[],int b[]) {
	int c[]=new int[a.length+b.length];
	int i=0;
	int j=0;
	int k=0;
	
	while(i<a.length && j<b.length) {
		if(a[i]<b[j]) 
		{
		c[k]=a[i];//c[k++]=a[i++]
		k++;
		i++;
		}
		else{
		c[k]=b[j];//c[k++]=b[j++]
		k++;
		j++;
		}
	}
	//if we have extra elements in the    a    array
	while(i<a.length)
	{
		c[k]=a[i];
		k++;
		i++;
	}
	//if we have extra elements in the    b    array
	while(j<b.length)
	{
		c[k]=b[j];
		k++;
		j++;
	}
	return c;
}
	public static void main(String[] args) {
		
		int a[]= {10,20,30};
		int b[]= {2,9,300,400};
		
		int arr[]=mergeAndsort(a,b);
		System.out.println(Arrays.toString(arr));
	}

}
