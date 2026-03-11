package com.puneet.collection;

public class Employee  {

	String name;
	int salary;
	String company;
	public Employee(String name, int salary, String company) {
		this.name = name;
		this.salary = salary;
		this.company = company;
	}
	@Override
	public String toString() {
		return name+"  "+salary+"  "+company; 
	}

	
	
}
