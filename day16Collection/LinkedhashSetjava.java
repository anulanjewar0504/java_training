package com.jbk.day16Collection;

import java.util.LinkedHashSet;

public class LinkedhashSetjava {
	public static void main(String[] args) {
		Employee e1 = new Employee (01,"Anurag","2024","Developer",90000);
		Employee e2 = new Employee (02,"Shravani","2024","Developer",70000);
		Employee e3 = new Employee (03,"Hardik","2024","Developer",60000);
		Employee e4 = new Employee (04,"Pratik","2024","Developer",50000);
		Employee e5 = new Employee (05,"Om","2024","Tester",40000);
		
		LinkedHashSet<Employee> list = new LinkedHashSet<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		System.out.println("--------------------------------");
		System.out.println("Size:"+list.size());
		System.out.println("--------------------------------");
		
		list.remove(e2);
		list.remove(e5);
		
		list.forEach(o-> System.out.println(o));
		System.out.println("--------------------------------");
		System.out.println(list.contains(e5));	
		list.clear();
		System.out.println("--------------------------------");
		System.out.println("after clearing: "+list.size());
	}
}
