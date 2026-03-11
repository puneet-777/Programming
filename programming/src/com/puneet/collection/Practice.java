package com.puneet.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Practice {

	public static void main(String[] args) {
		
		
		List<String> list=Arrays.asList("Amit","raj","rishi");
		list.forEach(x-> System.out.println(x));
		System.out.println();
		list.forEach(System.out::println);
		System.out.println();
		
		List<Integer> list1=Arrays.asList(1,2,3,4,5);
		long ans = list1.stream().filter(x->x%2==0).count();
		System.out.println(ans);
		
		
	

}
}