package com.jbk.collection;

import java.util.ArrayList;

public class Program2 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("PERL");
		al.add("PHP");
		System.out.println(al);
		
		System.out.println("Element at index 1: "+al.get(1));
		System.out.println("Dose list contain JAVA? >>"+al.contains("JAVA"));
		
		System.out.println(al);
	}
}
