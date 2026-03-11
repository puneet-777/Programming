package com.puneet.numbersystem;

public class HappyNumber {
static boolean IsHappy(int n) {

	while(n>9) {
		int sum=0;
	while(n>0) {
		int rem=n%10;
		sum+=rem*rem;
		n=n/10;
	}
	n=sum;
	}
	return n==1;
	
}
public static void main(String[] args) {

int n=49;
if(IsHappy(n))
	System.out.println("Happy");
else
	System.out.println("not");
	}

}
