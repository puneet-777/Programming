package com.puneet.numbersystem;

public class SumOfPrimeDigit {

		public static boolean IsPrime(int n) {
			if(n<=1)
				return false;
			for(int i=2;i<=n/2;i++) {
				if(n%i==0)
					return false;
			}
			return true;
			
		}
		public static int Sumofprimedigit(int n) {
			int sum=0;
			while(n>0) {
				int rem=n%10;
				if(IsPrime(rem)) {
					
					sum+=rem;
					}
					n=n/10;
				
			}return sum;
		}

	public static void main(String[] args) {
		int n=2582;
		int PrimeDigit=Sumofprimedigit(n);
		System.out.println("sum of prime digit is: "+PrimeDigit);
	}

}
