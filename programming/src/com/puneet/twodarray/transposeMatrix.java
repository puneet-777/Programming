package com.puneet.twodarray;

public class transposeMatrix {

	public static void main(String[] args) {
		
		int arr[][]= {{5,7,8,4},{6,4,2,7},{8,9,3,9},{6,6,7,5}};
		for(int i=0;i<arr[0].length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
}
