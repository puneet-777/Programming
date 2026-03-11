package com.puneet.ProgrammingPractice;

import java.util.Arrays;

public class SortArrayElementIndesc {

	public static int[] sortArray(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		return arr;

	}

	public static void main(String[] args) {

		int arr[] = { 14, 5, 42, 2, 525, 10 };

		int[] res = sortArray(arr);
		System.out.println(Arrays.toString(res));
	}

}
