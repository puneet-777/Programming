package com.puneet.ProgrammingPractice;

public class SubArraySumsDiffrence{
	public static void main(String[] args) {
		int [] a = {5,4,3,4,6,7,1};
		int start=-1,end=-1;
		int target = 17;
		for(int i=0;i<a.length;i++) {
			int cursum = 0;
			for(int j=i;j<a.length;j++) {
				cursum += a[j];
				if(cursum==target) {
					start=i;end=j;
				}
			}
		}
		System.out.println(start+" , "+end);
		
	}

}