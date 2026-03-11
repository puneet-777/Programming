package com.puneet.array;

public class LinearSearchInArray {
	public static int LinearSearch(int a[],int s) {
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==s)
				return i;
		}
		return -1; 
	}

	public static void main(String[] args) {
		
		int a[]= {10,11,12,13,14,15,16};
		int search=11;
		
		int index=LinearSearch(a, search);
		if(index== -1)
			System.out.println("not found");
		else
			System.out.println("found");
	}

} 

