package com.puneet.collection;
@FunctionalInterface
public interface Test {

	abstract void add(int a,int b);
	
	public static void main(String[] args) {
		Test t1=(a,b) ->{int res=a+b; System.out.println(res);};
		t1.add(10, 20);
	}
}
  