package com.puneet.ProgrammingPractice;

public class MostRepeatedEle {

	public static void main(String[] args) {
		
		int arr[]={1,2,3,14,15,14,3,6,3,1,8,8,3};
		boolean arr1[]= new boolean[arr.length];
		int mostrep=arr[0];
		int maxcount=0;
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr1[i]==false)
			{
				int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr1[j]=true;
				}
				
			}
			
				if(count>maxcount)
				{
					maxcount=count;
					mostrep=arr[i];
				}
			}
			
			
		}
		System.out.println("most repead element "+mostrep+" repeats "+maxcount+" times");

	}

}
