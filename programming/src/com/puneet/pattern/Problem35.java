package com.puneet.pattern;

public class Problem35 {

	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int k=1;k<=n;k++) {
			for(int j=1;j<=k;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
