package dsa;

import java.util.LinkedHashMap;

public class OccuranceOfCharInString {

	public static void main(String[] args) {

			LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
			String s="hello";
			for(int i=0;i<s.length();i++)
		    {
				char ch=s.charAt(i);
				if(map.containsKey(ch)) {
					map.put(ch,map.get(ch)+1);
				}
				else {
					map.put(ch, 1);
				}
			}
			for(char key:map.keySet()) {
				System.out.println(key+"--"+map.get(key));
			}
		
		
	}

}
