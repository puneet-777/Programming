package com.puneet.String;

public class ThreeDuplicateString {

	public static void main(String[] args) {
		String s = "abcabcabcabcabc";
		int dup = 3;
		int itr=0;
		char[] ch = s.toCharArray();
		boolean b[] = new boolean[ch.length];

		for (int i = 0; i < ch.length; i++) {
			if (b[i] == false) {
				int count = 1;
				for (int j = i + 1; j < ch.length; j++) {
					if (ch[i] == ch[j]) {
						count++;
						b[j] = true;
					}
				}
				if(count>1)
				{
					itr++;
					if(dup==itr)
					{
						System.out.println(ch[i]+" "+count);
						break;
					}
					
				}
					
					
			}
		}
	}
}
