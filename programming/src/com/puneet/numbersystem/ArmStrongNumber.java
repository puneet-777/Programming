package com.puneet.numbersystem;

public class ArmStrongNumber {
public static boolean isArmStrong(int n){
String s=n+"";
int count=s.length();
int sum=0;
int temp=n;
while(n>0) {
	
	sum=sum+(int)Math.pow(n%10,count);
	n=n/10;
}
return sum==temp;
}
	public static void main(String[] args){
int n=152;
if(isArmStrong(n)) 
	System.out.println("armstrong");
	else
		System.out.println("not");

	}
}