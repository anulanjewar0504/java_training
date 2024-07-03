package com.jbk.day10Strings;

public class Program1 {
	public static void main(String[] args) {
		String s1 = new String("HELLO");
		String s2 = new String("HELLO");
		
		if (s1.equals(s2)) {
			System.out.println("both strings are same and case sencitive");
		}
		else {
			System.out.println("Not same");
		}

	}	
}
