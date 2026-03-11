package com.puneet.twodarray;

public class SnakePatternColwise {

	public static void main(String[] args) {
		int arr[][]= {{5,7,8},{6,4,2},{8,9,3}};
		for(int j=0;j<arr[0].length;j++)
		{
			if(j%2 == 0)
			{
				for(int i=0;i<arr.length;i++)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
			else
			{
				for(int i=arr.length-1;i>=0;i--)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
}
