package com.puneet.collection;

public class Car {

	String brand;
	String model;
	String color;
	double price;
	public Car(String brand, String model, String color, double price) {
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.price = price;
	}
	
	public String toString() {
		return brand+" "+model+" "+color+" "+price; 
	}
	
	public int hashCode() {
		return brand.hashCode();
	}
	
	public boolean equals(Object obj) {
		String s1=this.brand;
		Car car=(Car)obj; 
		String s2=car.brand;
		return s1.equals(s2);
	}
	
}
