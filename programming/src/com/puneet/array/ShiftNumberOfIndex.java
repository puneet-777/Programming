package com.puneet.array;

import java.util.Arrays;

public class ShiftNumberOfIndex {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int k=109;
		for(int j=1;j<=k;j++) {
			int ind=a[0];
			for(int i=1;i<a.length;i++) {
				a[i-1]=a[i];
			}
			a[a.length-1]=ind;
		}
		
		System.out.println(Arrays.toString(a));
	}
}
