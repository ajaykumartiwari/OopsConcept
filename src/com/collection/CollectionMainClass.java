package com.collection;

import java.util.HashMap;

public class CollectionMainClass {

	public static void main(String[] args) {
		HashMap<Employee, Integer> hMap = new HashMap<>();
		
		Employee e1 = new Employee();
		e1.setEmpId(1);
		
		Address a = new Address();
		a.setCity("Bangalore");
		a.setStreet("Pai");
		e1.setAdd(a);
		
		Employee e2 = new Employee();
		e1.setEmpId(2);
		
		Address a1 = new Address();
		a1.setCity("Bangalore");
		a1.setStreet("Pai");
		e1.setAdd(a1);
		
		Employee e3 = new Employee();
		e1.setEmpId(1);
		
		Address a2 = new Address();
		a2.setCity("Bangalore");
		a2.setStreet("Pai");
		e1.setAdd(a2);
		
		hMap.put(e1, 1);
		hMap.put(e2, 1);
		hMap.put(e3, 1);
		
		System.out.println(hMap);
		

	}

}
