package com.puneet.String;

public class UniqueString {

	public static boolean isUnique(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j])
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		String s = "abcd";
		
		if (isUnique(s))
			System.out.println("unique");
		else {
			System.out.println("not");
		}
	}

}
