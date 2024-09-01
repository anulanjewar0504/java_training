package com.jbk.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Demo1 {
	public static void main(String[] args) {
		HashSet<String>hs = new HashSet<>();
		hs.add("Java");
		hs.add("By");
		hs.add("Kiran");
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}
}
