package com.puneet.ProgrammingPractice;

public class StringProgram2 {

	public static void main(String[] args) {

		String s = "ab12cd34ef";
		String result = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				String w = "";

				switch (ch) {
				case '0':
					w = "Zero";
					break;
				case '1':
					w = "One";
					break;
				case '2':
					w = "Two";
					break;
				case '3':
					w = "Three";
					break;
				case '4':
					w = "Four";
					break;
				case '5':
					w = "Five";
					break;
				case '6':
					w = "Six";
					break;
				case '7':
					w = "Seven";
					break;
				case '8':
					w = "Eight";
					break;
				case '9':
					w = "Nine";
					break;

				}
				result = result + w;
			} else {
				result = result + ch;
			}
		}

		System.out.println(result);
	}

}
