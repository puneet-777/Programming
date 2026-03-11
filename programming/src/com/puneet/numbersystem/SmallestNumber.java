package com.puneet.numbersystem;

public class SmallestNumber {

	public static void main(String[] args) {

int a=2;
int b=1;
int c=0;
int res=(a<b&&a<c)?a:(b<c)?b:c; 
System.out.println("Smallest :"+res);
	}

}
