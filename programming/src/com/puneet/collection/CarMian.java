package com.puneet.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
import java.util.HashSet;

public class CarMian {

	public static void main(String[] args) {
		
		Car c1=new Car("Safari","s1111","black",350000);
		Car c2=new Car("Scorpio","s11","white",15000);
		Car c3=new Car("SUV","SUV700","blue",450000);
		Car c4=new Car("Nexon","N13","green",114000);
		Car c5=new Car("Nano","N90","red",100000);
		
		HashSet<Car> h1=new HashSet<Car>();
		h1.add(c1);
		h1.add(c2);
		h1.add(c3);
		h1.add(c4);
		h1.add(c5);
		
		for(Car c:h1) {
			System.out.println(c);
		}
		
		System.out.println();
		
		ArrayList<Car> aList=new ArrayList<Car>(h1);
		Collections.sort(aList,(o1,o2)->Double.compare(o2.price,o1.price));
		for(Car c:aList) {
		System.out.println(c);	
		}
	}

}
