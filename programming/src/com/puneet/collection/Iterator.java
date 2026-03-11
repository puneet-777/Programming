package com.puneet.collection;

import java.util.ArrayList;


public class Iterator {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		arrayList.add(60);
		
		java.util.Iterator<Integer> itr=arrayList.iterator();
		
		while(itr.hasNext())
		{
				
			System.out.println(itr.next());
		}
	}

}
