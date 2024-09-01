package com.jbk.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("Kiran");
		hs.add("Java");
		hs.add("By");
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}
}
