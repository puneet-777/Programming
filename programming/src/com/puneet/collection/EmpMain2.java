package com.puneet.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
// 5->FETCH ALL THE EMPLOYEE BELONGS TO TCS AND PEROVIDE 20% SALARY HIKE AND STORE THE IN A SAPERATE LIST PRINT THE SALARY BEFOR AND AFTER HIKE

public class EmpMain2 {

	public static void main(String[] args) {

		Employee e1 = new Employee("Ankush", 37000, "TCS");
		Employee e2 = new Employee("Aditya", 11000, "wWIPRO");
		Employee e3 = new Employee("Anil", 25000, "INFOSYS");
		Employee e4 = new Employee("Suhash", 40000, "TCS");
		Employee e5 = new Employee("Rishabh", 24000, "TCS");
		Employee e6 = new Employee("Ankit", 52000, "HCL");
		Employee e7 = new Employee("Arjit", 30000, "GOOGLE");
		Employee e8 = new Employee("Puneet", 120000, "MICROSOFT");
// 		WITHOUT STREAM
		List<Employee> l1 = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8);

		List<Double> l2 = new ArrayList<Double>();

		for (Employee e : l1) {
			if (e.company.equalsIgnoreCase("tcs")) {
				System.out.println(e.salary);
				l2.add(e.salary + (e.salary * 0.2));
			}
		}
		System.out.println();
		for (Double e : l2) {
			System.out.println(e);
		}
		System.out.println();
//		WITH-STREAM

		List<Double> x = l1.stream().filter(o1 -> o1.company.equalsIgnoreCase("tcs"))
				.peek(o1 -> System.out.println(o1.salary)).map(o1 -> o1.salary + (o1.salary * 0.20))
				.collect(Collectors.toList());
			
		x.forEach(o1 -> System.out.println(o1));

	}

}
