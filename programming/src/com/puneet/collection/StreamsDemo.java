package com.puneet.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {
		//FOR INTERMEDIATE OPERATION USE FOLLOWINGS !!
		//1->filter
		List<String> list=Arrays.asList("Amit","Akshit","mayank","anit","Amit");
		
		long a1 = list.stream().filter(x->x.startsWith("A")).count();
//		System.out.println(a1);
		//2->map
		
		String x1 = list.stream().map(x->x.toUpperCase()).toString();
//		System.out.println(x1);
		
		//3->sorted
		list.stream().sorted((a,b)->a.length()-b.length());
		list.stream();
		//4->sorted
//		System.out.println(list.stream().filter(x->x.startsWith("A")).distinct().count());
//		5->limit
		System.out.println(Stream.iterate(1,x->x+1).limit(100).count()); 
		
//		6->skip
		System.out.println(Stream.iterate(1,x->x+1).skip(10).limit(100).count()); 
		
		
	}
	

}
