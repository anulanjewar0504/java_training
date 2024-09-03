// copying data of arraylist into string array
package com.jbk.day23Collection;

import java.util.ArrayList;

public class ArraycopytoArraylist {
	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<>();
		arr1.add("Pune");
		arr1.add("Amravati");
		arr1.add("Nagpur");
		arr1.add("Mumbai");
		arr1.add("hydrabad");
		
		String[] str = new String[arr1.size()];
		
		arr1.toArray(str);
		
		System.out.println("The copird array contant is: ");
		for(String s: str) {
			System.out.print(s+" ");
		}
	}
}
