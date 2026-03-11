package ajit;

public class armstrong {
	
	static int sumoff(int n) {
		
		int sum=0;
		int res=count(n);
		while(n!=0) {
			int rem=n%10;
			sum+=product(rem,res);
			n=n/10;
		}
		return sum;
	}
	
	static int count(int n) {
		int c1=0;
		while(n!=0) {
			c1++;
			n=n/10;  
		}
		return c1;
	}
	
	
	
	static int product(int base, int power) {
		int pro=1;
		for(int i=0;i<power;i++) {
			pro*=base; 
		}
		return pro;
	}
	
	
	
	public static void main(String[] args) {
			int n=153;
//			int a=n;
//			int b=sumoff(n);
////			
			if(sumoff(n)==n) {
				System.out.println("strong number");
			}
			else {
				System.out.println("not a strong number");
			}
		
			System.out.println(sumoff(n));
	}
}
