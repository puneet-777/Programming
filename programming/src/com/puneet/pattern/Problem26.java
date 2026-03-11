package com.puneet.pattern;

public class Problem26{
//	A B C D E F G 
//	  A B C D E 
//	    A B C 
//	      A 
//	    A B C 
//	  A B C D E 
//	A B C D E F G 


	public static void main(String[] args) {
		int n = 7;
		int sp = 0;
		int st = n;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= st; k++) {
				System.out.print((char)(k+64)+" ");
			}
			if (i < n / 2 +1 ) //OR i<n/2+1
				{
				sp++;
				st = st - 2;
			} else {
				sp--;
				st = st + 2;
			}
			System.out.println();
		}

	}

}
