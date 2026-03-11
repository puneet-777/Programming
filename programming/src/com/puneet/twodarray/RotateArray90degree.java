package com.puneet.twodarray;
public class RotateArray90degree {
	public static  int[][] rotate(int arr[][])
	{
		
		for(int i=1;i<arr[0].length;i++)
		{
			for(int j=0;j<i;j++)
			{
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			int stCol=0,endCol=arr[0].length-1;
			while(stCol<endCol)
			{
				int temp=arr[i][stCol];
				arr[i][stCol]=arr[i][endCol];
				arr[i][endCol]=temp;
				stCol++;
				endCol--;
			}
		}
		return arr; 
	}
	public static void main(String[] args) {
		int arr[][]= {{5,7,8,4},{6,4,2,7},{8,9,3,9},{6,6,7,5}};
		
		int[][] res = rotate(arr);
		for(int arr1[]:res)
		{
			for(int el:arr1)
			{
				System.out.print(el+" ");
			}
			System.out.println();
		}
	}
}
