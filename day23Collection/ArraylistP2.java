package com.jbk.day23Collection;

import java.util.ArrayList;

public class ArraylistP2 {
	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<>();
		
		// adding city
				arr1.add("Pune");
				arr1.add("Amravati");
				arr1.add("Nagpur");
				arr1.add("Mumbai");
				arr1.add("hydrabad");
		// get element by index
				System.out.println("element at index 0:"+arr1.get(0) );
				System.out.println("element at index 3:"+arr1.get(3) );;
				System.out.println("element at index 4:"+arr1.get(4) );
				
				System.out.println("Does list contain list Amravati: "+ arr1.contains("Amravati"));
				System.out.println("The ArrayList is Empty?: "+arr1.isEmpty());
				System.out.println("The index of Mumbai is: "+arr1.indexOf("Mumbai"));
				System.out.println("The size of arraylist is: "+arr1.size());
	}
}