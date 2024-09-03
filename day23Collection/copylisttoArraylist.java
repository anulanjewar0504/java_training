package com.jbk.day23Collection;

import java.util.ArrayList;
import java.util.List;

public class copylisttoArraylist {
	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<>();
		// adding city
		arr1.add("Pune");
		arr1.add("Amravati");
		arr1.add("Nagpur");
		arr1.add("Mumbai");
		arr1.add("hydrabad");
		
		List<String> l1 = new ArrayList<>();
		System.out.println();
		l1.add("London");
		l1.add("france");
		l1.addAll(arr1);
		System.out.println(l1);
		arr1.addAll(l1);
		System.out.println(arr1);
	}
}
