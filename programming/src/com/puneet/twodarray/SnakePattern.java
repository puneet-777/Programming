package com.puneet.twodarray;
//rowwise snake pattern
public class SnakePattern {

	public static void main(String[] args) {

		int arr[][] = { { 2, 4, 6 }, { 10, 12, 14 }, { 16, 18, 20 } };
		
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                // left to right
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                // right to left
                for (int j = arr[0].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }

	}
}
