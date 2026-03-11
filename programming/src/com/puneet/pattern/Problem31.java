package com.puneet.pattern;

public class Problem31 {

	public static void main(String[] args) {
		int n=7;
		int m=n/2+1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1 || j==n || i==j&&i<=m || i+j==n+1&&i<=m)
					System.out.print("*"+" ");
				else
					System.out.print("  ");
			}
			System.out.println(); 
		}

	}

}
