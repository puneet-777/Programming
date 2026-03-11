package com.puneet.array;

public class BiggenrElementInArray {

	public static void main(String[] args) {
		
		int a[]= {1,13,14,150,16,17};
		int big=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>big)
				big=a[i];
		}
		System.out.println(big);
	}

}
