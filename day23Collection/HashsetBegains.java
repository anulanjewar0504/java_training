// program to iterate Hashset element through iterator
package com.jbk.day23Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetBegains {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("Anurag");
		hs.add("developer"); 
		hs.add("Lanjewar");
		hs.add("developer"); // it dose not allow duplicate element.
		
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
		System.out.println(itr.next());
		}
	}
}
