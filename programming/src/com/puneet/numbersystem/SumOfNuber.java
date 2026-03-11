package com.puneet.numbersystem;

public class SumOfNuber {
	public static int SumofNum(int n) {
		int sum=0;
		while(n>0){
			int rem=n%10;
			sum+=rem;
			n=n/10;
		}
		return sum;
			
		}
public static void main(String[] args) {
	int n=123456789;
	int sum=SumofNum(n);
	System.out.println("SUM :"+sum);
}
}
