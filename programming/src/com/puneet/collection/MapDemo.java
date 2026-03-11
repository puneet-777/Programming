package com.puneet.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MapDemo {

	public static void main(String[] args) {
		
	HashMap<Integer,String> map=new HashMap<Integer, String>();  
	map.put(1, "ravi");
	map.put(2, "puneet");
	map.put(3, "raj");
	map.put(4, "rishi");
	
	System.out.println(map);
	String s=map.get(3); 
	System.out.println(s);
	System.out.println(map.containsKey(8));
	System.out.println(map.containsValue("puneeta"));
	
	for(int i:map.keySet())
	{
		System.out.println(map.get(i));
	}
	
	Set<Map.Entry<Integer, String>> entries=map.entrySet();
	for(Map.Entry<Integer, String>  entry:entries) 
	{
//	System.out.println(map.get(entries));
	}
	
		}

}
