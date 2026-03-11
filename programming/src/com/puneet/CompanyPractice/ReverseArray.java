package com.puneet.CompanyPractice;

import java.util.Arrays;

public class ReverseArray {
public static int[] reverse(int arr[]) {
	int i=0;
	int j=arr.length-1;
	while(i<j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
	}
	return arr; 
}
	public static void main(String[] args) {
		int arr[]= {4,8,3,4,1,9};
		
		int result[]=reverse(arr);
		
		System.out.println(Arrays.toString(result));
	}
}
