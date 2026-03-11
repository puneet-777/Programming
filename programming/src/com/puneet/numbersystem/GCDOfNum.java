package com.puneet.numbersystem;

public class GCDOfNum {

	public static int gcdofnum(int num1, int num2) {
		int gcd = 1;
		for (int i = 1; i <= num1 && i<=num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
					gcd = i;
			}
		}
		return gcd;
	}

	public static void main(String[] args)
	{
		int n=24;
		int m=28;
		 int result=gcdofnum(n, m);
		 System.out.println("The GCD is: "+result);
	}

}
