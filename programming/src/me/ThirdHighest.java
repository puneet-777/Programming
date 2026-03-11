package me;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class ThirdHighest {
	public static void main(String[] args) {
		Integer [] arr = {10,20,30,20,10};
		
		int n=3;
		
	//	Arrays.stream(arr).distinct().sorted((o1,o2)->o2-o1).skip(n-1).limit(1).forEach(System.out::print);
		
		
//		Map<Integer, Long> collect = Arrays.stream(arr).collect(Collectors.groupingBy(e -> e,Collectors.counting()));
//
//	
//		System.out.println(collect);
		
		
		
	}

}
