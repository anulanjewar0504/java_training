// Copy map contant to another hashmap
package com.jbk.day24collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Copy_Map {
	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("First", "Java");
		hm.put("Second", "Full-Stack");
		hm.put("Third", "Developer");
		
		System.out.println(hm);
		HashMap<String, String> hm1 = new HashMap<String, String>();
		hm1.put("c1", "JVM");
		hm1.put("c2", "JDK");
		System.out.println(hm1);
		
		hm1.putAll(hm);
		Set<String>keys = hm1.keySet();
		
//		for(String key:keys) {
//			System.out.println("Value of"+key+" is: "+hm1.get(keys));
//		}
		
		System.out.println(hm1);
		
		
		
	}
}
