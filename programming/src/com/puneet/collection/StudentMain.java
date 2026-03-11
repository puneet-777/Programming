package com.puneet.collection;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {

	public static void main(String[] args) {
		
		
		Student s1=new Student("puneet", 1);
		Student s2=new Student("atul", 2);
		Student s3=new Student("aditya",3);
		Student s4=new Student("mayank",4);
		Student s5=new Student("ankush",5);
		
		 ArrayList<Student> aList=new ArrayList<Student>();
		 aList.add(s1);
		 aList.add(s2);
		 aList.add(s3);
		 aList.add(s4);
		 aList.add(s5);
		 
		 Collections.sort(aList);
		 
		 for(Student s:aList)
		 {
			 System.out.println(s);
		 }
		 
	}

}
