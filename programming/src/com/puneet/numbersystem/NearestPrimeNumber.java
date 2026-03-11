package com.puneet.numbersystem;

public class NearestPrimeNumber {
	public static boolean IsPrime(int n) {
        if(n<=1)
		return false;
		for(int i=2;i<=n/2;i++){
			
			if(n%i==0)
				return false;
		}
		 
		return true;
		
	}
public static void main(String[] args) {
int n=2;
int i=2;
int count=0;
while(true) {
	if(IsPrime(i)) {
		count++;
	}
	if(count==n) {
		System.out.println(i);
		break;
	}
	i++;
}
   }

}
