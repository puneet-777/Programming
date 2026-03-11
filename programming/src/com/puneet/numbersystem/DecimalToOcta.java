package com.puneet.numbersystem;

public class DecimalToOcta {
	public static String DecToOcta(int dec) {
		String octa="";
		while(dec>0) {
			int rem=dec%8;
			octa=rem+octa;
			dec=dec/8;
		}
		return octa;
	}

	public static void main(String[] args) {

		int dec=75;
		String res=DecToOcta(dec);
		System.out.println(res);
		
	}

}
