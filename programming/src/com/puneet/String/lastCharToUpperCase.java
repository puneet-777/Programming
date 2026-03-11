package com.puneet.String;

public class lastCharToUpperCase {

	public static void main(String[] args) {
		String s = "rAm is good";
		s = s.toLowerCase();
		char ch[] = s.toCharArray();
		for (int i =0;i<ch.length;i++) {
		if (i == ch.length-1 && ch[i] != ' ' || ch[i] != ' ' && ch[i + 1] == ' ') {
		ch[i] = Character.toUpperCase(ch[i]);
			}

		}
		System.out.println(ch); 
	}
}
