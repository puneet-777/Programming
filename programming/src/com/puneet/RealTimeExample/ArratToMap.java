package com.puneet.RealTimeExample;

import java.util.HashMap;

public class ArratToMap {

	public static void main(String[] args) {
		
		int a[]= {101,102,103};
		String s[]= {"puneet","ajit","atul"};
		
		HashMap<Integer, String> hashMap=new HashMap<Integer, String>();

		for(int i=0;i<a.length;i++) {
			hashMap.put(a[i], s[i]);
		}
		System.out.println(hashMap);
	}
}
