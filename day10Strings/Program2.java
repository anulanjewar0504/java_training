package com.jbk.day10Strings;

public class Program2 {
	public static void main(String[] args) {
		String s1 = "INDIA";
		for(int i =0; i<s1.length();i++) {
			for(int j = 0; j<4;j++) {
				System.out.print(s1.charAt(i));
			}
			System.out.println();
		}
	}
}
