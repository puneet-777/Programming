package com.puneet.String;

public class consoVovelCount {

	public static void main(String[] args) {
		String s = "AbceieEf";
		s=s.toLowerCase();
		int vc = 0;
		int cc = 0;
//		s = s.toString();
		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);
//			if (Character.isAlphabetic(ch)) {
if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o')
				{
					vc++;
				}
				else
				{
					cc++;
				}
//			}
		}

		System.out.println("Vovel=" + vc);
		System.out.println("Consonent=" + cc);
	}

}
