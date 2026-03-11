package com.puneet.CompanyPractice;

public class BinarySearch {
	
	public static int BinarySearch1(int arr[],int target)
	{
		int i=0,j=arr.length-1;
		while(i<=j)
		{
			int mid=(i+j)/2;
			if(arr[mid]==target)
			{
				return mid;
			}
			if(arr[mid]<target)
			{
				i=mid+1;//
			}
			else {
				j=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {12,13,14,15,16,17,18};
		int targer=17;
		int result=BinarySearch1(arr,targer);
		if(result== -1)
		{
			System.out.println("not found");
		}
		else {
			System.out.println("found");
		}
		
	}
}
