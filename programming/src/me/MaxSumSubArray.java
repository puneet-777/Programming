package me;

public class MaxSumSubArray {

	public static void main(String[] args) {
		
		int arr[]= {1,2,4,5,7,8,9};
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=i+1;j<arr.length;j++)
			{
				sum+=arr[j];
				maxSum=Math.max(maxSum, sum);
				
			}
		}
		System.out.println(maxSum);
	}
}
