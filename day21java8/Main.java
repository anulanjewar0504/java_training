package com.jbk.day21java8;

public class Main {
	public static void main(String[] args) {
		I obj;
		obj = (a,b)-> a+b;
		System.out.println(obj.op(10, 30));
		obj = (a,b)-> a-b;
		System.out.println(obj.op(10, 30));
		obj = (a,b)-> a*b;
		System.out.println(obj.op(10, 30));
		obj = (a,b)-> a/b;
		System.out.println(obj.op(10, 30));
		obj = (a,b)-> a%b;
		System.out.println(obj.op(10, 30));
	}
}
