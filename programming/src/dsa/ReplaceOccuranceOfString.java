package dsa;

public class ReplaceOccuranceOfString {

	public static void main(String[] args) {

		String s = "abababa";
		String s1 = "aba";
		String s2 = "a";

		String result = "";

		for (int i = 0; i < s.length();) {

			boolean found = true;

			// Check if s1 matches starting from index i
			if (i + s1.length() <= s.length()) {
				for (int j = 0; j < s1.length(); j++) {
					if (s.charAt(i + j) != s1.charAt(j)) {
						found = false;
						break;
					}
				}
			} else {
				found = false;
			}

			// If match found → append s2
			if (found) {
				result += s2;
				i += s1.length(); // skip matched part
			}
			// If not matched → copy normal character
			else {
				result += s.charAt(i);
				i++;
			}
		}

		System.out.println(result);
	}
}
