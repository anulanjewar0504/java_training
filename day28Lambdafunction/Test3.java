package com.jbk.day28Lambdafunction;

public class Test3 {
	public static void main(String[] args) {
		Inter2 m;
		m = (x) -> Math.PI*x*x;
		System.out.println(m.m1(5));
		
		m = Cal::squ;
		System.out.println(m.m1(5));
		
		
	}
}
