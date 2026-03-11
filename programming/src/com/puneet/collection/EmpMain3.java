package com.puneet.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class EmpMain3 {

	public static <K> void main(String[] args) {

		Employee e1 = new Employee("Ankush", 37000, "TCS");
		Employee e2 = new Employee("Aditya", 11000, "wWIPRO");
		Employee e3 = new Employee("Anil", 25000, "INFOSYS");
		Employee e4 = new Employee("Suhash", 40000, "TCS");
		Employee e5 = new Employee("Rishabh", 24000, "TCS");
		Employee e6 = new Employee("Ankit", 52000, "HCL");
		Employee e7 = new Employee("Arjit", 30000, "GOOGLE");
		Employee e8 = new Employee("Puneet", 120000, "MICROSOFT");
//	6->	FROM THE LIST OF EMPLOYEE GROUP THEM BASED ON SALARY
// 		WITH-STREAM
		List<Employee> l1 = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8);

		Map<Object, List<Employee>> ans = l1.stream().map(o1 -> o1).collect(Collectors.groupingBy(o1 -> o1.company));
		for (Entry<Object, List<Employee>> m : ans.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue() + " " + m.getValue().size());
		}
		System.out.println();
		
//			7->from the list of employee fetch them in asc/desc based on salary
		l1.stream().sorted((o1,o2)->o2.salary-o1.salary).forEach(o1->System.out.println(o1));
		System.out.println();
		
//fetch top 3 salary holder
		l1.stream().sorted((o1,o2)->o2.salary-o1.salary).limit(3).forEach(o1->System.out.println(o1));
		System.out.println();
		
////		WITHOUT-STREAM

		Map<Object, List<Employee>> map = new HashMap<Object, List<Employee>>();
//		8->fetch top 3 salary holder
		

		for (Employee e : l1) {
			String com = e.company;

			if (map.containsKey(com) == false) {
			map.put(com, new ArrayList<Employee>());
		}
			List<Employee> x = map.get(com);
			x.add(e);
		}

	
	}
}

