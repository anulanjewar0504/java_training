package com.jbk.day23Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class DeleteformarrayList {
	public static void main(String[] args) {
		ArrayList<String>arr1 = new ArrayList<>();
		// adding city
		arr1.add("Pune");
		arr1.add("Amravati");
		arr1.add("Nagpur");
		arr1.add("Mumbai");
		arr1.add("hydrabad");
		
		Iterator<String> itr = arr1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		arr1.clear();
		
		System.out.println(">>>>> "+arr1);
		
	}
}
