package com.puneet.numbersystem;

import java.util.Scanner;

public class CheckPerfectNumber {
	public static boolean isperfect(int number) {
		int sum = 0;
		int original = number;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		return sum == original;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		System.out.println(isperfect(number));
		sc.close();
	}
}
