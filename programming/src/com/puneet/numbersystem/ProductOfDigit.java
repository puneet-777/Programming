package com.puneet.numbersystem;

public class ProductOfDigit {
	public static int productofdigit(int n) {
		int product=1;
		while(n>0) {
			int rem=n%10;
			product*=rem;
			n/=10;
		}
		return product;
	}

	public static void main(String[] args) {
		int n=1452;
		int Product=productofdigit(n);
		System.out.println(Product);
	}

}
