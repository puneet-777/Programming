package com.puneet.ProgrammingPractice;

public class LongestCommonPrefix {

	public static String LongestStringg(String arr[]) {
		 if (arr == null || arr.length == 0)
	            return "";

	        String prefix = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            while (!arr[i].startsWith(prefix)) {
	                prefix = prefix.substring(0, prefix.length() - 1);
	                if (prefix.isEmpty())
	                    return "";
	            }
	        }
	        return prefix;
	    }

	public static void main(String[] args) {

		String arr[] = { "geeksforgeeks", "geeks", "geek", "geezer" };
		String result = LongestStringg(arr);
		System.out.println(result);
	}

}
