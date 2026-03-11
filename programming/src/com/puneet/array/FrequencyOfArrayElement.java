package com.puneet.array;

public class FrequencyOfArrayElement {
//Find the occorence of array element\\
	public static void main(String[] args) {
		int a[] = { 10, 20, 10, 30 };
		boolean b[] = new boolean[a.length];

		for (int i = 0; i < a.length; i++) {
			if (b[i] == false) {
				int count = 1;
				for (int j = i + 1; j < a.length; j++) {

					if (a[i] == a[j]) {
						count++;
						b[j] = true;
					}
				}

				System.out.println(a[i] + "||" + count);

			}

		}

	}
}
