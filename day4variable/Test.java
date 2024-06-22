package com.jbk.day4variable;

public class Test {
	public static void main(String[] args) {
		Var v = new Var();
		System.out.println("short = "+Var.s);
		System.out.println("int = "+Var.a);
		System.out.println("byte = "+Var.b);
		System.out.println("float = "+Var.f);
		System.out.println("char = "+Var.c); 
		System.out.println("boolean = "+Var.bo);
		System.out.println("long = "+Var.lo);
		System.out.println("double = "+Var.d);
		System.out.println("-------------------------------");
		System.out.println("short = "+v.sa);
		System.out.println("int = "+v.aa);
		System.out.println("byte = "+v.ba);
		System.out.println("float = "+v.fa);
		System.out.println("char = "+v.ca); 
		System.out.println("boolean = "+v.boa);
		System.out.println("long = "+v.loa);
		System.out.println("double = "+v.da);
		System.out.println("-------------------------------");
		System.out.println(v.add(2, 10));
	}
}
