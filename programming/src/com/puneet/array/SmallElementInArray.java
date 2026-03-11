package com.puneet.array;

public class SmallElementInArray {

	public static void main(String[] args) {
		int a[]= {1000,130,1400,150,16,7};
		int small=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<small)
				small=a[i];
		}
		System.out.println(small);
	}

}

