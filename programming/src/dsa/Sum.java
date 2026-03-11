package dsa;


public class Sum {
	static int suN(int n) {
		if(n==0) {
			return 0;
		}
		else {
			return n+suN(n-1);
		}
	}
	static int sumN(int n) {
		if(n==1) {
			return 1;
		}
		return n+sumN(n-1);
	}
	static int fact(int n) {
		if(n==1) {
			return 1;
		}
		return n*fact(n-1);
	}
	
	
//	static String rev(String s) {
//		
//	}
	static int len = 0;
	static int sumArr(int a[],int l) {
		if(len==a.length-1) {
			return a[a.length-1];
		}
		return a[len]+sumArr(a,len++);
	}
	public static void main(String[] args) {
//		System.out.println(sumN(10));
//		System.out.println(suN(10));
//		System.out.println(fact(5));
		int a[] = {1,2,3,4,5,5};
		System.out.println(sumArr(a,len));
	}
}









