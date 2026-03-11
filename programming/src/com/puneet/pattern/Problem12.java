package com.puneet.pattern;

public class Problem12 {

	public static void main(String[] args) {
		int n=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.printf("%4d",n);
				n++;
			}
			System.out.println();
		}
	}

}
