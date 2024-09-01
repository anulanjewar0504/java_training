package com.jbk.collection;

import java.util.HashSet;

public class HashSetdemo1 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("java");
		hs.add("By");
		hs.add("Kiran");
		System.out.println(hs);
		System.out.println("HashSet is empty or not = "+hs.isEmpty());
		hs.remove("Karvenagar");
		System.out.println(hs);
		System.out.println("Dose 'java' contain in hashset? = "+hs.contains("java"));
	}
}
