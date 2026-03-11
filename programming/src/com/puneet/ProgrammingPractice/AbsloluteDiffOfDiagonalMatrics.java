 package com.puneet.ProgrammingPractice;

public class AbsloluteDiffOfDiagonalMatrics {

	public static void main(String[] args) {
		
		int arr[][]= {{1,4,3},{7,9,1},{5,3,4}};
		int psum=0,ssum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i==j)
				{
					psum+=arr[i][j];
				}
				if(i+j==arr.length-1)
				{
					ssum+=arr[i][j];
				}
			}
		}
		System.out.println(Math.abs(ssum-psum));
	}
}
