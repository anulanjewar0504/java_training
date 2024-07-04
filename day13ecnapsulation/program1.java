package com.jbk.day13ecnapsulation;

public class program1 {
	public static void main(String[] args) {
		Capsule1 c1 = new Capsule1(101,"anurag",21);
		System.out.println(c1);
		c1.setAge(21);
		c1.setName("Shravani");
		c1.setId(111);
		System.out.println(c1);
	}
}
