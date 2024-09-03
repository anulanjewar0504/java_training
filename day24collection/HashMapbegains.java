package com.jbk.day24collection;

import java.util.HashMap;
import java.util.Set;

public class HashMapbegains {

	public static void main(String[] args) {
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("First", "Java");
		hm.put("Second", "Full-Stack");
		hm.put("Third", "Developer");
		
		System.out.println(hm);
		Set<String>keys=hm.keySet();
		
		for(String key:keys) {
			System.out.println("Value of "+key+" is "+hm.get(key));
		}
		
	}
}
