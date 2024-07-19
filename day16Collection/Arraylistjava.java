package com.jbk.day16Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistjava {
	public static void main(String[] args) {
		Employee e1 = new Employee (01,"Anurag","2024","Developer",90000);
		Employee e2 = new Employee (02,"Shravani","2024","Developer",70000);
		Employee e3 = new Employee (03,"Hardik","2024","Developer",60000);
		Employee e4 = new Employee (04,"Pratik","2024","Developer",50000);
		Employee e5 = new Employee (05,"Om","2024","Tester",40000);
		
		ArrayList<Employee> e = new ArrayList<Employee>();
		
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);
		e.add(e5);

		Iterator<Employee> t = e.iterator();
		while (t.hasNext()) {
			Employee m = t.next();
			System.out.println(m);
		}
		System.out.println("--------------------------------");
		System.out.println("Size:"+e.size());
		System.out.println("--------------------------------");
		
		e.remove(e2);
		e.remove(e5);
		
		e.forEach(o-> System.out.println(o));
		System.out.println("--------------------------------");
		System.out.println(e.contains(e5));	
		e.clear();
		System.out.println("--------------------------------");
		System.out.println("after clearing: "+e.size());
		
		
	}
}
