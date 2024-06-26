// find all the odd numbers in the rage of 270 to 500
package com.jbk.day7logical;

public class Program5 {
	public static void main(String[] args) {
		for (int i = 270; i<=500; i++) {
			if (i%3==0) {
				System.out.println(i);
			}
		}
	}

}
