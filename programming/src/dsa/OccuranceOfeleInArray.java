package dsa;

import java.util.LinkedHashMap;


public class OccuranceOfeleInArray {

	public static void main(String[] args) {
		LinkedHashMap<Integer, Integer> l1=new LinkedHashMap<Integer, Integer>();
		int arr[]= {5,6,2,3,4,5,5,6,1,1,6,5};
		
		for(int i=0;i<arr.length;i++)
		{
			int key=arr[i];
			if(l1.containsKey(key))
			{
				l1.put(key,l1.get(key)+1);
			}
			else {
				l1.put(key, 1);
			}
		}
		for(int a:l1.keySet())
		{
			System.out.println(a+"--"+l1.get(a));
		}
	}

}
