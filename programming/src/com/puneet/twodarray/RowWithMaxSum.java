package com.puneet.twodarray;

public class RowWithMaxSum {

	public static void main(String[] args) {
		
		int arr[][]= {{1,2,3},{4,5,7},{9,6,4}};
		 int MaxSum=0;
		 int row=-1;
		for(int i=0; i<arr.length;i++)
		{
			int sum=0;
			for(int j=0;j<arr[0].length;j++)
			{
				sum+=arr[i][j];
			}
			if(sum>MaxSum)
			{
				MaxSum=sum;
				row=i;
			}
		}
		System.out.println("Index="+row+"   "+"MaxSum="+MaxSum);
	}
}
