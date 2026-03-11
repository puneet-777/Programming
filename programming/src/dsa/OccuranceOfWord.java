package dsa;

import java.util.LinkedHashMap;

public class OccuranceOfWord {

	public static void main(String[] args) {
		String s="hi hello hi bye hi hello bye bye bye";
		String arr[]=s.split(" ");
		LinkedHashMap<String, Integer> l1=new LinkedHashMap<String, Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(l1.containsKey(arr[i])) {
				l1.put(arr[i],l1.get(arr[i]+1));
			}
			else {
				l1.put(arr[i], 1);
			}
		}
//		for(String )

	}

}
