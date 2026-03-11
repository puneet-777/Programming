package com.puneet.ProgrammingPractice;

public class DigitToString {
	
	public static void main(String[] args) {
		
		int n=12345;
		String string="";
		while(n!=0) {
			
			int rem=n%10;
			
			switch(rem) {
			case 0:
				string="zero"+string;
				break;
			case 1:
				string="0ne"+string;
				break;
			case 2:
				string="two"+string;
				break;
			case 3:
				string="three"+string;
				break;
			case 4:
				string="four"+string;
				break;
			case 5:
				string="five"+string;
				break;
			case 6:
				string="six"+string;
				break;
			case 7:
				string="seven"+string;
				break;
			case 8:
				string="eight"+string;
				break;
			case 9:
				string="nine"+string;
				break;
			
			}
			n=n/10;
		}
		System.out.println(string);
		
	}
}
