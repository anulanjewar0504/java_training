// write program to print cube of number 1 to 10
package com.jbk.day6iterator;

public class Program2 {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "-->" +Math.pow(i, 3));
		}
	}
}