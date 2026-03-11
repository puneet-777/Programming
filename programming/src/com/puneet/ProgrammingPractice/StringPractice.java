package com.puneet.ProgrammingPractice;

//MOOLYA COMPANY QUESTION->1
public class StringPractice {

	public static void main(String[] args) {

		String s = "aaabbcccddf";
		int count = 1;
		String res = "";
		char ch[] = s.toCharArray();

		for (int i = 0; i < ch.length - 1; i++) {

			if (ch[i] == ch[i + 1]) {
				count++;
			} else {
				if (count > 2) {
					res += ch[i] + "" + count;
					count = 1;
				} else {
					for (int j = 0; j < count; j++) {
						res = res + "" + ch[i];
					}
					count = 1;
				}
			}
		}
		if (count > 2) {
			res += ch[ch.length - 1] + "" + count;
		} else {
			for (int k = 0; k < count; k++) {
				res = res + "" + ch[ch.length - 1];
			}
		}
		System.out.println(res);
	}
}
