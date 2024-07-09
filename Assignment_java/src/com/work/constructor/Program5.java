//creating constructor chain using this keyword
package com.work.constructor;

public class Program5 {
	public Program5() {
		System.out.println("Default constructor");
	}
	public Program5(String str) {
		this();
		System.out.println("parameterised constructor with single parameter");
	}
	public Program5 (String str, int a) {
		this ("hello");
		System.out.println("parameterised constructor with double parameter");
	}
	public Program5 (int a, int b,int c) {
		this ("hello",a);
		System.out.println("parameterised constructor with triple parameter");
			
		}
}
