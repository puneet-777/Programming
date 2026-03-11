package com.puneet.array;

public class MostRepeatedElement {

	public static void main(String[] args) {
		int a[] = { 10, 20,30,10,10,10,20,20,20,20,20};
		boolean b[] = new boolean[a.length];
		int mostrep=a[0];
		int maxcount=0;
//		int dup=0;
		for (int i = 0; i < a.length; i++) {
			if (b[i] == false) {
				int count = 1;
				for (int j = i + 1; j < a.length; j++) {

					if (a[i] == a[j]) {
						count++;
						b[j] = true;
					}
				}
				if(count>maxcount)
				{
//				System.out.println(a[i] + "||" + count);
					maxcount=count;
				mostrep=a[i];
				}
				
			}
 
		}
		System.out.println("most repeated="+maxcount+" ");

	}

}
