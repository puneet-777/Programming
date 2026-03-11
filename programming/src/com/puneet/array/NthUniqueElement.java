package com.puneet.array;
public class NthUniqueElement{

	public static void main(String[] args) {
		int a[]= {12,15,12,19,15,20,5,4};
		boolean b[]=new boolean[a.length];
		int n=1;
		int duplcount = 0;
		for(int i=0;i<a.length;i++) {
			if(b[i]==false) {
				int count=1;
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						count++;
						b[j]=true;
					}
				}
				if(count==1) {
					duplcount++;
						System.out.println(a[i]);
						if(duplcount==n)
							break;
				}
			}
		}

	}

}
