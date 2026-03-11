package com.puneet.String;

public class NthUniqueString {

	public static void main(String[] args) {

		String s = "puneet";
		char[] ch = s.toCharArray();
		boolean b[] = new boolean[ch.length];
		int nthvar=2;
		int urep=0;
		for (int i = 0; i < ch.length; i++) {
			if (b[i] == false)

			{
				int count = 1;
				for (int j = i + 1; j < ch.length; j++) {
					if (ch[i] == ch[j]) {
						count++;
						b[j] = true;
					}

				}
				if(count==1)
				urep++; 
				if(urep==nthvar) {
					System.out.println(ch[i]);
					break;}
			}
			
		}

	}

} 
