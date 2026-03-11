package com.puneet.array;

public class SumOfOddElements {

	public static void main(String[] args) {
		int a[]= {5,6,7,4,5,2,9};
		int s=0;
		for(int i=0;i<a.length;i++) {
			if(i%2!=0)
			s+=a[i];
		}
		System.out.println("Sum="+s);

	}

}
