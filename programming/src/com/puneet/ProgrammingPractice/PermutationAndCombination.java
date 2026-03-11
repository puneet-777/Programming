package com.puneet.ProgrammingPractice;


class Super{
	public int x=1;
}
class app extends Super{
	public app(int x) {
		x=x; 
	}
}
public class PermutationAndCombination {
	
	public static void main(String[] args) {
	
		app a1=new app(10);
		System.out.println(a1.x);
	}
}
