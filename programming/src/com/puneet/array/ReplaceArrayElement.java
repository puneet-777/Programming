package com.puneet.array;

import java.util.Arrays;

public class ReplaceArrayElement {
	public static int Sum(int n) {
		int sum=0;
		while(n>0) {
			sum=n%10+sum;
			n=n/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int a[]= {12,13,14,15,16,17};
		for(int i=0;i<a.length;i++) {
			int result=Sum(a[i]);
				a[i]=result;	
				}
		System.out.println(Arrays.toString(a));
		}



}
