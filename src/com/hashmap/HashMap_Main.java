package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Main {
	public static void main(String[] args) {
		Map<Employee, Integer> map = new HashMap<Employee, Integer>();
		map.put(new Employee("sarvesh", "12"), 1);
		map.put(new Employee("sarvesh", "12"), 1);
		map.put(new Employee("sarvesh", "12"), 1);
		
		map.put(new Employee("sarvesh", "12"), 1);
		map.put(new Employee("sarvesh", "12"), 1);
		map.put(new Employee("sarvesh", "12"), 1);
		map.put(new Employee("dinesh", "12"), 1);
		map.put(new Employee("sarvesh", "2"), 1);
		map.put(new Employee("Parvesh", "12"), 1);
		
		
		Map<EmployeeWrapper, Integer> map1 = new HashMap<EmployeeWrapper, Integer>();
		
		map1.put(new EmployeeWrapper(new Employee("sarvesh", "12")), 1);
		map1.put(new EmployeeWrapper(new Employee("sarvesh", "12")), 1);
		map1.put(new EmployeeWrapper(new Employee("sarvesh", "12")), 1);
		map1.put(new EmployeeWrapper(new Employee("sarvesh", "12")), 1);
		map1.put(new EmployeeWrapper(new Employee("sarvesh", "12")), 1);
		
		System.out.println("------------------------------------------------");
		
		Iterable<Map.Entry<EmployeeWrapper, Integer>> iterable1 = map1.entrySet();
		for (Map.Entry<EmployeeWrapper, Integer> getIterable : iterable1) {
			System.out.println(getIterable.getKey().getEmployee().getEmp_name() + " " + getIterable.getKey().getEmployee().getEmp_number() + " "
					+  getIterable.getValue());
		}
		System.out.println("------------------------------------------------");
		
		Iterable<Map.Entry<Employee, Integer>> iterable = map.entrySet();
		for (Map.Entry<Employee, Integer> getIterable : iterable) {
			System.out.println(getIterable.getKey().getEmp_name() + " " + getIterable.getKey().getEmp_number() + " "
					+ getIterable.getValue());
		}
	}
}
