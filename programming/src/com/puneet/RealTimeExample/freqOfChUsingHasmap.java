package com.puneet.RealTimeExample;

import java.util.HashMap;

public class freqOfChUsingHasmap {
public static void main(String[] args) {
	
	String s="aabbccddd";
	HashMap<Character,Integer> hashMap=new HashMap<>();
	
	for(char ch:s.toCharArray()) {
		
		if(hashMap.containsKey(ch)) {
			hashMap.put(ch, hashMap.get(ch)+1);
		}
		else {
			hashMap.put(ch, 1);
		}
	}
	System.out.println(hashMap);
	
	
}
}
