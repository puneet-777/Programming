package com.puneet.ProgrammingPractice;

public class NthUnique {

	public static void main(String[] args) {
		
		
		int arr[]={1,2,3,3,4,5,6};
		int nth=3;
		int rep=0;
		boolean arr1[]= new boolean[arr.length];
		
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
				if(count==1)
				{
				rep++;
				if(rep==nth)
				{
					System.out.println(arr[i]+" "+count);
				break;
				}
					
				}
	
			}
			
		}
	}

}
