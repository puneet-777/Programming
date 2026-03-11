package com.puneet.numbersystem;

public class DecimalToBinary {
	public static String DecToOcta(int dec) {
		String octa="";
		while(dec>0) {
			int rem=dec%2;
			octa=rem+octa;
			dec=dec/2;
		}
		return octa;
	}

	public static void main(String[] args) {

		int dec=14;
		String res=DecToOcta(dec);
		System.out.println(res);
		
	}

}
