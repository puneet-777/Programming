package com.puneet.ProgrammingPractice;

import java.util.Scanner;

public class SinglePower {

	static int power(int n) {
		int s = 2;
		for (int i = 1; i < n; i++) {
			s *= 2;
		}
		System.out.println(s);
		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		power(n);
		sc.close();
	}
}
