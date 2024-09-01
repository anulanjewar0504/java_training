package com.jbk.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Program1 {
	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<>();
		
		arr1.add("Pune");
		arr1.add("Mumbai");
		arr1.add("Amravati");
		arr1.add("Nagpur");
		arr1.add("Akola");
		
		Iterator<String> itr = arr1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
