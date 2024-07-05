package com.jbk.day14polymorphism;

public class Program1 {
	public static void main(String[] args) {
		Overloading o1 = new Overloading();
		System.out.println(o1.add(2.5f, 3.6f));
		System.out.println(o1.add(58.3f, 40));
		System.out.println(o1.add(61,22.3f));
		System.out.println(o1.add(78, 12));
		System.out.println(o1.add(5, 4, 3));
	}
}
