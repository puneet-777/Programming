package com.puneet.RealTimeExample;

import java.util.HashMap;
public class freqOfChUsingHasmap2 {
	public static void main(String[] args) {

		String s = "java is fun and java is powerful";
		String str[] = s.split(" ");

		HashMap<String, Integer> hashMap = new HashMap<>();
		
		for(String w:str) {
			 if(hashMap.containsKey(w)) {
				 hashMap.put(w,hashMap.get(w)+1);
			 }
			 else {
				hashMap.put(w,1);
			}
		}
		System.out.println(hashMap);

	}
}
