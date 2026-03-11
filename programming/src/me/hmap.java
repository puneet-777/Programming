package me;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hmap {

	public static void main(String[] args) {
		
Map<Integer, String> map=new HashMap<Integer, String>();
map.put(1,"puneet");
map.put(2,"puneet");
map.put(3,"puneet");
map.put(4,"puneet");

for(Entry<Integer, String> e:map.entrySet())
{
	System.out.println(e.getKey()+" "+e.getValue());
}
	}
}
