package com.puneet.pattern;

public class Problem32 {

	public static void main(String[] args) {
		int n=7;
		int m=n/2+1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==m || j==m || j==1&&i<=m || i==n&&j<=m || j==n&&i>=m || i==1&&j>=m)
				System.out.print("*"+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
