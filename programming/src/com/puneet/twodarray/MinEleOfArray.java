package com.puneet.twodarray;

public class MinEleOfArray {

	public static void main(String[] args) {
		int arr[][]= {{5,7,8,4},{6,4,2,7},{8,9,3,9},{6,6,7,5}};
		
		int minEle=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			int maxEle=arr[i][0];
			for(int j=0;j<arr[i].length;j++)
			{
				if(maxEle < arr[i][j]) 
				{
					maxEle=arr[i][j]; 
				}
			}
			if(maxEle<minEle)
			{
				minEle=maxEle;
			}
		}
		System.out.println(minEle);
	}
}
