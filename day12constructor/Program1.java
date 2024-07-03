package com.jbk.day12constructor;

public class Program1 {
	public static void main(String[] args) {
		Student s1 = new Student (12549,"BE");
		Student s2 = new Student (111,"Anurag","2002",12549,"BE");
		Student s3 = new Student ();
		System.out.println(s3);
		System.out.println(s1);
		System.out.println(s2);
	}
}
