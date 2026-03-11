package com.puneet.numbersystem;

import java.util.Scanner;

public class SumOfFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=scan.nextInt();
		int sum=0;
		for(int i=1;i<=number/2;i++) {
			if(number%i==0) {
				System.out.println(i);
				sum+=i;
			}
		}
		sum+=number;
		System.out.println("sum: "+sum);
	}

}
