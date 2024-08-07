package com.jbk.day20Strings;

public class StringP1 {
	public static void main(String[] args) {
		String s = "Good Morning Anurag  ";
		String sb = "Good Morning Anurag  ";
		System.out.println(s);
		
		String[] s2 = s.split(" ");
		for(String t:s2){
			System.out.print(t);
		}
		
		System.out.println();
		String s3 = s.replace('n', 'h');
		System.out.println(s3);
		
		String s4 = s.substring(0, 6);
		System.out.println(s4);
		
		String s5 = s.toLowerCase();
		System.out.println(s5);
		
		String s6 = s.toUpperCase();
		System.out.println(s6);
		
		String s7 = s.concat("are you ok?");
		System.out.println(s7);
		
		String s8 = s.trim();
		System.out.println(s8+"...");
		
		
		
		if(s.equals(sb)) {
			System.out.println("s and sb is equal");
		}
		else {
			System.out.println("s and sb is not equal");
		}
		
		char [] arr = s.toCharArray();
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
		
		System.out.println();
		System.out.println(s.charAt(7));
		
		System.out.println(s.length());				
	}
}
