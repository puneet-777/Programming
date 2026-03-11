package com.puneet.String;

public class ReverseTheGivenSentence2 {

	public static void main(String[] args) {
		String s = "ram is good";
		String main = "";
		String word = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				word = word + s.charAt(i);
			} else {
				main = " " + word + main;
				word = "";
			}

		}
		main = word + main;
		System.out.println(main);

	}

}