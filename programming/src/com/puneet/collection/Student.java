package com.puneet.collection;

public class Student implements Comparable<Student> {
	
	String name;
	int id;
	
	 Student(String name,int id) {
		this.name=name;
		this.id=id;
	}

	 @Override
	 public int compareTo(Student s) {
		 
		return s.id-this.id;
		
	 }

	 @Override
	 public String toString() {
		return name+ "  "+id ; 
	 }
	 
	 
	
	

}
