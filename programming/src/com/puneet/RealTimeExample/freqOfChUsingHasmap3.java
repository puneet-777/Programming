package com.puneet.RealTimeExample;

import java.util.Scanner;

public class freqOfChUsingHasmap3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input=");
		String s = sc.next();

		if (s.length() >=3) {
			System.out.println(s.substring(s.length()-3));
		} else {
			System.out.println("input not match");
		}

	}
}
