// find factorial
package com.jbk.day7logical;

public class Program4 {
	public static void main(String[] args) {
		int fact =  1;
		int no = 5;
		for (int i = 1; i<=no; i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}
}
