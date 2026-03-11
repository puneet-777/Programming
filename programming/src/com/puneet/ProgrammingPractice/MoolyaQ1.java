package com.puneet.ProgrammingPractice;

public class MoolyaQ1 {

	public static void main(String[] args) {
		String s = "aaabbccccddeeeffffa";
		char ch[] = s.toCharArray();
		int count = 1;
		String result = "";

		for (int i = 0; i < ch.length - 1; i++) {

			if (ch[i] == ch[i + 1]) {
				count++;
			}

			else {
				if (count > 2) {
					result = result + ch[i] + "" + count;
					count = 1;
				} else {
					for (int k = 0; k < count; k++) {
						result = result + "" + ch[i];
					}
					count = 1;
				}

			}

		}
		for (int k = 0; k < count; k++) {
			result = result + "" + ch[ch.length - 1];
		}
		System.out.println(result);
	}

}
