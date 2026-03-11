package com.puneet.numbersystem;

public class StrongNumber {
public static boolean IsStrong(int n) {
	int sum=0;
	 int temp=n;
	 while(n>0)
	 {
		 sum+=factorial(n%10);
		 n=n/10;
	 }
	 return sum==temp;
}
public static int factorial(int n) {
		int fact=1;
		for(int i=n;i>=1;i--) {
			fact*=i;
		}
		return fact;
}
	public static void main(String[] args) {
		int n=145;
		if(IsStrong(n))
			System.out.println("strong");
		else
			System.out.println("not");
	}

}
