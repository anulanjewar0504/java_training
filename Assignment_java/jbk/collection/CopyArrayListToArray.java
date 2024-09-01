package com.jbk.collection;

import java.util.ArrayList;

public class CopyArrayListToArray {
	public static void main(String[] args) {
		ArrayList<String> el = new ArrayList<>();
		el.add("Amravati");
		el.add("pune");
		el.add("Mumbai");
		el.add("Nagpur");
		el.add("Mirjapur");
		System.out.println("ArrayList: "+el);
		// defining array
		String [] strary = new String [el.size()];
		el.toArray(strary);
		System.out.println("\nCopying arraylist.....");
		System.out.print("[");
		for(int i =0;i<strary.length;i++) {
			System.out.print(" "+strary[i]+" , ");
		}
		System.out.print("]");
		
	}
}
