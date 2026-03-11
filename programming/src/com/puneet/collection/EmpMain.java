package com.puneet.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
//1->fetch all the employee who belongs to tcs company 
//2->and salary greater then 30000
//3->and fetch who take 24000 or above in tcs and store them in saperate list
//4->store in array

public class EmpMain { 

	public static void main(String[] args) {

		Employee e1 = new Employee("Ankush", 37000, "TCS");
		Employee e2 = new Employee("Aditya", 11000, "wWIPRO");
		Employee e3 = new Employee("Anil", 25000, "INFOSYS");
		Employee e4 = new Employee("Suhash", 40000, "TCS");
		Employee e5 = new Employee("Rishabh", 24000, "TCS");
		Employee e6 = new Employee("Ankit", 52000, "HCL");
		Employee e7 = new Employee("Arjit", 30000, "GOOGLE");
		Employee e8 = new Employee("Puneet", 120000, "MICROSOFT");

		List<Employee> l1 = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8);

//		WITHOUT STREAM
		List<Employee> l2 = new ArrayList<Employee>();
		for (Employee e : l1) {
			if (e.company.equalsIgnoreCase("tcs") && e.salary >= 24000)

			{
				l2.add(e);
			}
		}

		l2.forEach(x -> System.out.println(x));
		System.out.println();

//		WITH STREAM
//System.out.println(l1.stream().filter(o1 -> o1.company.equalsIgnoreCase("TCS")).filter(o1 -> o1.salary >= 24000).collect(Collectors.toList()));
  Object[] x = l1.stream().filter(o1 -> o1.company.equalsIgnoreCase("TCS")).filter(o1 -> o1.salary >= 24000).toArray();
  System.out.println(Arrays.toString(x)); 

	}

}
