package com.puneet.array;

import java.util.Arrays;

public class MoveZeroElementEnd {
	public static void main(String[] args) {
		int[] a = { 1, 2, 0, 6, 0, 8, 3, 0, 9 };

		int index = 0;
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] != 0)
			{
				a[index++] = a[i];
			}
		}
		for (int i = index; i < a.length; i++) {
			a[index++] = 0;
		}
		System.out.println(Arrays.toString(a));
	}
}
  