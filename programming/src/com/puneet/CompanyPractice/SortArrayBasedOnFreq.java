package com.puneet.CompanyPractice;

public class SortArrayBasedOnFreq {
	public static void main(String[] args) {
		int[] arr = { 4, 6, 2, 6, 4, 4, 8, 6 };
		int n = arr.length;

		// Step 1: Count frequency of each number
		int[] freq = new int[n];
		for (int i = 0; i < n; i++) {
			freq[i] = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] == arr[i]) {
					freq[i]++;
				}
			}
		}

		// Step 2: Sort based on frequency and value
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (freq[i] < freq[j] || (freq[i] == freq[j] && arr[i] > arr[j])) {

					// Swap values
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

					// Swap frequency too
					int t = freq[i];
					freq[i] = freq[j];
					freq[j] = t;
				}
			}
		}

		// Print result
		System.out.print("Sorted by Frequency: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
