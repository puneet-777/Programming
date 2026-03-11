package com.puneet.numbersystem;

import java.util.Scanner;

public class FactorOfNum { 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int number=sc.nextInt();
		for(int i=1;i<=number/2;i++) {
			if(number%i==0) {
				System.out.println(i+" ");
			}
		}
		
		
}

}
