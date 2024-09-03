// Exoploring Hashset operation
package com.jbk.day24collection;

import java.util.HashSet;

public class HashsetOperation {
	public static void main(String[] args) {
		HashSet<Integer> marks = new HashSet<>();
		marks.add(10);
		marks.add(20);
		marks.add(30);
		marks.add(40);
		marks.add(50);
		
		System.out.println(marks.size());
		System.out.println(marks);
		System.out.println(marks.isEmpty());
		System.out.println(marks.contains(50));
		marks.remove(20);
		System.out.println(marks.contains(20));
		
	}
	
}
