package com.puneet.numbersystem;

public class CheckPrime {
	public static boolean IsPrime(int n) {
		if(n<=1)
			return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
		
	}

	
public static void main(String[] args) {
	
	int num=2;
	boolean res=IsPrime(num);
	System.out.println(res);
	
}

}
