package com.puneet.pattern;

public class px1 {
	
public static void main(String[] args) {
	
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++) {
			System.out.print("  ");
		}
		int x=i;
		for(int k=1;k<=2*i-1;k++) {
			System.out.print(x+" ");
			if(k<i)
				x--;
			else
				x++;
		}
		System.out.println();
	}
}

}

