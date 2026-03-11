package com.puneet.array;

public class First3DuplicateElement {

	public static void main(String[] args) {
		int a[] = { 12, 15, 12, 13,19, 15, 17, 19, 20, 21, 22, 20, 21 };
		boolean b[] = new boolean[a.length];
		int duplcount = 0;
		for (int i = 0; i < a.length; i++) {
			if (b[i] == false) {
				int count = 1;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;
						b[j] = true;
					}
				}
				if (count > 1) {
					System.out.println(a[i]+" "+count); 
					duplcount++;
					if (duplcount == 3)
						break;
				}
			}
		}

	}

}
