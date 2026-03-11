package com.puneet.ProgrammingPractice;

public class StringProgram {

	public static void main(String[] args) {

		String input = "a2b3C4";
		char ch[] = input.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z' || ch[i] >= 'A' && ch[i] <= 'Z') {
				char letter = ch[i];

				int count = ch[i + 1] - '0';

				for (int j = 0; j < count; j++) {
					System.out.print(letter);
					
				}
			}
		}

	}

}
