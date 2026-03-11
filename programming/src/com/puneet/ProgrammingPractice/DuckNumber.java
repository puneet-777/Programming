package com.puneet.ProgrammingPractice;

import java.util.Scanner;

public class DuckNumber {
	public static boolean isDuckNumber(int n) {
		
		while(n!=0) {
			int rem=n%10;
			if(rem==0) {
				return true;
			}
			n=n/10;
		}
		return false; 
	}

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int inp=scanner.nextInt();
		
		if(isDuckNumber(inp)) {
			System.out.println("It is duck number");
		}
		else {
			System.err.println("It is not duck");
		}
	}
}
