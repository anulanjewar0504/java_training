package com.jbk.day21java8;

public class Test {
	public static void main(String[] args) {
		J obj;
		obj = A::areaofcircle;
		System.out.println(obj.p(5));
		
		obj = (side) -> side*side;
		System.out.println(obj.p(5));
	}
}
