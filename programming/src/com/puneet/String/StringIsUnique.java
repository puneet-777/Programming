package com.puneet.String;

public class StringIsUnique {

	public static boolean isUnique(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j))
					return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {

		String s = "abc";

		if (isUnique(s))
			System.out.println("unique");
		else
			System.out.println("not");

	}

}
