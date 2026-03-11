package com.puneet.numbersystem;

public class ArmstrongNumber2 {
public static boolean IsArmStrong(int n) {
	int sum=0;
	int count=CountDigit(n);
	int temp=n;
	while(n>0) {
		sum=sum+power(n%10,count);
		n=n/10;
		
	}
	return sum==temp;
}
static int CountDigit(int n) {
	int count=0;
	while(n>0) {
	int digit=n%10;
	count++;
	n=n/10;
	}
	return count;	
}                  
static int power(int n,int p) {
	int pow=1;
	for(int i=1;i<=p;i++) {
		pow=pow*n;
	}
	return pow;
}
public static void main(String[] args) {
	int n=153;
	if(IsArmStrong(n))
		System.out.println("Armstrong");
	else
		System.out.println("not");
}
}
