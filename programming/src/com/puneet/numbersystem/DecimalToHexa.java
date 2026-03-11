package com.puneet.numbersystem;

public class DecimalToHexa {
	public static String DecToHexa(int dec) {
		String hex="";
		while(dec>0) {
			int rem=dec%16;
			if(rem>9) {
				hex=(char)(rem+55)+hex;	
			}
			else {
				hex=rem+hex;
			}
			dec=dec/16;
		}
		return hex;
	}

	public static void main(String[] args) {
		int dec=31;
		
		System.out.println(DecToHexa(dec));
		
	}

}
