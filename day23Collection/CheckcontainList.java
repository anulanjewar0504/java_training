package com.jbk.day23Collection;

import java.util.ArrayList;
import java.util.List;

public class CheckcontainList {
	public static void main(String[] args) {
		ArrayList<String> ar1 = new ArrayList<>();
		ar1.add("Anurag");
		ar1.add("Shravani");
		ar1.add("Ram");
		
		List<String> l1 = new ArrayList<>();
		l1.add("Anurag");
		l1.add("Shravani");
		l1.add("Ram");
		
		List<String> l2 = new ArrayList<>();
		l2.add("tree");
		l2.add("Shravani");
		l2.add("gym");
		
		System.out.println(ar1.containsAll(l1));
		System.out.println(ar1.containsAll(l2));
		
	}
}
