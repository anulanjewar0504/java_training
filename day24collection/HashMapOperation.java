// HashMap Operation
package com.jbk.day24collection;

import java.util.HashMap;

public class HashMapOperation {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("One","Anurag");
		hm.put("Second", "Shravani");
		hm.put("Third", "closed");
		hm.put("Fourth", "Third_Person");
		System.out.println(hm);
		
		System.out.println(hm.get("Second"));
		hm.remove("Fourth");
		System.out.println(hm);
		System.out.println(hm.isEmpty());
		System.out.println(hm.size());
		
		
	}
}
